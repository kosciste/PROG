/**
 * Die Klasse MessApp steuert einen Messablauf, um die Performance des
 * Zufallszahlengenerators zu messen.
 */
public class MessApp {
    private Messkonduktor messkonduktor;
    private int[][] messungen;

    /**
     * Fuehrt eine Messung durch.
     */
    public void messen() {
        initialisieren();
        analyseDurchfuehren();
        berechneUndDruckeMittelwerteMessreihe();
        berechneUndDruckeMittelwerteMessung();
    }

    private void initialisieren() {
        // TODO Objektsammlung und Messkonduktor erzeugen
        messungen = new int[10][20];
        messkonduktor = new Messkonduktor(400000);
    }

    private void analyseDurchfuehren() {
        // TODO Benutzen Sie 'messkonduktor' um die Messungen
        // durchzufuehren und in der Objektsammlung zu speichern.
        for (int i = 0; i< messungen.length; i++)

        {
            messungen[i] = messkonduktor.messungenDurchfuehren(messungen[i]);
        }

    }

    private void berechneUndDruckeMittelwerteMessreihe() {
        // TODO Implementieren Sie die Methode.
        for (int i = 0; i < messungen.length; i++) 
        {
            int mittelwert = 0;
            int summe = 0;

            for(int j = 0; j < messungen[i].length; j++)
            {
                summe += messungen[i][j];

            }

            mittelwert = summe/messungen[i].length;
            System.out.println("Mittelwert von Messreihe " + i + ": " + mittelwert + "ms" );
        }

    }

    private void berechneUndDruckeMittelwerteMessung() {
        // TODO Implementieren Sie die Methode.
        int mittelwert = 0;
        int summe = 0;
        for(int i = 0; i < messungen[0].length; i++)

        {
            for (int j = 0; j < messungen.length; j++)
            {
                summe += messungen[j][i];
            }
            mittelwert = summe/messungen.length;
            System.out.println("Mittelwert pro Messung " + i + ": " + mittelwert + "ms" );
            summe = 0;

        }

    }
}