
public class Auto
{

    private String marke;
    private String typ;
    private double hubraum;
    private boolean turbo;
    private int lagerbestand;

    /**
     * Erstellt ein neues Auto mit der Marke, Typ, Hubraum und Turbo. Der Lagerbestand wird auf 0 gesetzt.
     */
    public Auto(String marke, String typ, double hubraum, boolean turbo) 
    {

        setzeMarke(marke);
        setzeTyp(typ);
        setzeHubraum(hubraum);
        setzeTurbo(turbo);
        lagerbestand = 0;

    }

    /**
     * Prüft ob die Eingabe für die Marke oder den Typ richtig ist.
     */
    public boolean isValidMarkeTyp(String markeTyp){

        return (markeTyp.length() >= 3)&&(markeTyp.length() <= 10);

    }

    /**
     * Prüft ob die Eingabe für den Hubraum richtig ist.
     */
    public boolean isValidHubraum(double hubraum) {

        return  (hubraum>=0.5)&&(hubraum<=8);

    }

    /** 
     * Ändert die Marke.
     */
    public void setzeMarke(String marke) {

        if (!(isValidMarkeTyp(marke))) {

            System.out.println("Fehler: min. 3 Zeichen und max. 10 Zeichen");
            this.marke = "___";
        }

        else {

            this.marke = marke;
        }

    }

    /**
     * Ändert den Typ.
     */
    public void setzeTyp(String typ) {

        if (!(isValidMarkeTyp(typ))) {

            System.out.println("Fehler: min. 3 Zeichen und max. 10 Zeichen");
            this.marke = "___";
        }

        else {

            this.typ = typ;
        }

    }

    /**
     * Ändert den Typ.
     */
    public void setzeHubraum(double hubraum) {

        if (!(isValidHubraum(hubraum))) {

            System.out.println("Fehler: min. 0.5L und max. 8L");

        }

        else {

            this.hubraum = hubraum;
        }

    }

    /**
     * Ändert ob es einen Turbo hat oder nicht.
     */
    public void setzeTurbo(boolean turbo) {

        this.turbo = turbo;

    }

    /**
     * Ändert den Bestand.
     */
    public void aendereBestand(int anzahl)

    {
        int alterLagerBestand = lagerbestand;

        if (anzahl > 10 || anzahl < -10 || anzahl == 0)
        {
            System.out.println("Bitte einen gültigen Wert angeben");

        } else {

            if((this.lagerbestand + anzahl) < 0)
            {
                System.out.println("Der Bestand kann nicht ins Negative gehen");
            }

            else {
                lagerbestand += anzahl;
                System.out.println("Erfolgreich geänderter Lagerbestand:");
                System.out.println("Alt: " + alterLagerBestand);
                System.out.println("Neu: " + lagerbestand);

            }

        }
    }

    /**
     * Gibt die Informationen zum Auto aus.
     */
    public void autoAusgeben(){
        String turboAusgeben = "";
        if (turbo) {
            turboAusgeben = "-t";
        }

        System.out.println(marke + " " + typ + ", " + hubraum + " Liter");
        System.out.println("Code: " + marke.substring(0,3) + "-" + typ.substring(0,3) + "-" + hubraum + turboAusgeben);
        System.out.println("Lagerbestand: " + lagerbestand);

    }

}