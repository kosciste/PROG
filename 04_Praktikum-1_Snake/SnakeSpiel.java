import java.awt.Point;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Spielklasse des Spiels Snake.
 * <p>
 * Ziel dieses Spiels ist es alle Goldstuecke einzusammeln und
 * die Tuer zu erreichen, ohne sich selber zu beissen oder in
 * die Spielfeldbegrenzung reinzukriechen.
 */
public class SnakeSpiel {
    private Schlange schlange;
    private Tuer tuer;
    private Spielfeld spielfeld;
    private List <Point> goldStuecke = new ArrayList<>();
    private int anzahlGoldStuecke = 10;
    private boolean spielLaeuft = true;
    private Scanner scanner;

    public static void main(String[] args) {
        new SnakeSpiel().spielen();
    }

    /**
     * Startet das Spiel.
     */
    public void spielen() {
        scanner = new Scanner(System.in);
        spielInitialisieren();
        while (spielLaeuft) {
            zeichneSpielfeld();
            ueberpruefeSpielstatus();
            fuehreSpielzugAus();
        }
        scanner.close();
    }

    private void spielInitialisieren() {
        tuer = new Tuer(0, 5);
        spielfeld = new Spielfeld(40, 10);
        schlange = new Schlange(30, 2);
        goldStueckeErstellen();
    }

    private void goldStueckeErstellen(){

        do {

            Point goldStueck = spielfeld.erzeugeZufallspunktInnerhalb();
            if (!(istEinGoldstueckAufPunkt(goldStueck))) {
                goldStuecke.add(goldStueck);
            }

        } while (goldStuecke.size() < anzahlGoldStuecke);

    }

    private void setzteAnzahlGoldstuecke(int anzahlGoldStuecke){

        if (!(anzahlGoldStuecke > 0)) 

        {
            System.out.println("Es muss mindestens ein Goldstueck haben");

        }

        else {

            this.anzahlGoldStuecke = anzahlGoldStuecke;

        }

    }

    private void zeichneSpielfeld() {
        char ausgabeZeichen;
        for (int y = 0; y < spielfeld.gibHoehe(); y++) {
            for (int x = 0; x < spielfeld.gibBreite(); x++) {
                Point punkt = new Point(x, y);
                ausgabeZeichen = '.';
                if (schlange.istAufPunkt(punkt)) {
                    ausgabeZeichen = '@';
                } else if (istEinGoldstueckAufPunkt(punkt)) {
                    ausgabeZeichen = '$';
                } else if (tuer.istAufPunkt(punkt)) {
                    ausgabeZeichen = '#';
                }
                if (schlange.istKopfAufPunkt(punkt)) {
                    ausgabeZeichen = 'S';
                }
                System.out.print(ausgabeZeichen);
            }
            System.out.println();
        }
    }

    private boolean istEinGoldstueckAufPunkt(Point punkt) {

        return (goldStuecke.contains(punkt));
    }

    private void ueberpruefeSpielstatus() {
        if (istEinGoldstueckAufPunkt(schlange.gibPosition())) {
            goldStuecke.remove(schlange.gibPosition());
            schlange.wachsen();
            System.out.println("Goldstueck eingesammelt.");
        }
        if (istVerloren()) {
            System.out.println("Verloren!");
            spielLaeuft = false;
        }
        if (istGewonnen()) {
            System.out.println("Gewonnen!");
            spielLaeuft = false;
        }
    }

    private boolean istGewonnen() {
        return goldStuecke == null &&
        tuer.istAufPunkt(schlange.gibPosition());
    }

    private boolean istVerloren() {
        return schlange.istKopfAufKoerper() ||
        !spielfeld.istPunktInSpielfeld(schlange.gibPosition());
    }

    private void fuehreSpielzugAus() {
        char eingabe = liesZeichenVonTastatur();
        schlange.bewege(eingabe);
    }

    private char liesZeichenVonTastatur() {
        char konsolenEingabe = scanner.next().charAt(0);
        return konsolenEingabe;
    }
}