public class MotorisiertesFahrzeug extends Fahrzeug {

    private int leistung;

    public MotorisiertesFahrzeug(String modell, int preis, int stueckzahl, int leistung) {

        super(modell, preis, stueckzahl);
        this.leistung = leistung;
    }


    /**
     * Liefert die Leistung des Autos.
     * @return Die Leistung
     */
    public int gibLeistung()
    {
        return leistung;
    }

    @Override
    public void leistungAusgeben(){
        System.out.println(leistung);
    }
}
