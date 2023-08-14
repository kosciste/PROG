import java.util.HashSet;

/**
 * Diese Klasse haelt eine Aufzaehlung der akzeptierten Befehlswoerter.
 * Mit ihrer Hilfe werden eingetippte Befehle erkannt.
 *
 * @author  tebe
 * @version 1.0
 */
public enum Befehlswort {
    UNBEKANNT("unbekannter Befehl"),
    GEHE("gehe"),
    HILFE("hilfe"),
    UMSEHEN("umsehen"),
    UEBERNIMM("uebernimm"),
    NIMM("nimm"),
    BEENDEN("beenden");

    private String befehl;


    /**
     * Konstruktor - initialisiere die Befehlswörter.
     */
    private Befehlswort(String befehl)
    {
        this.befehl = befehl;
    }

    /**
     * Gibt das zum Befehlswort gehörende ENUM-Objekt zurück, falls
     * das wort bekannt ist, ansonsten wird das ENUM-Objekt UNBEKANNT
     * zurückgegeben
     * @param wort
     * @return gibt das zum wort passende ENUM-Objekt zurück
     */
    public static Befehlswort gibBefehlswort(String wort) {
        try {

            return Befehlswort.valueOf(wort);

        } catch (Exception e) {

            return UNBEKANNT;
        }

    }

    /**
     * Getter
     * @return gibt das Datenfeld befehl zurück
     */
    public String gibBefehl(){

        return befehl;
    }

    /**
     * Pruefe, ob eine gegebene Zeichenkette ein gueltiger
     * Befehl ist.
     *
     * @return 'true', wenn die gegebene Zeichenkette ein gueltiger
     *         Befehl ist, 'false' sonst.
     */
    public static boolean istBefehl(String eingabe)
    {
        return gibBefehlsworteAlsText().contains(eingabe);
    }

    /**
     * Gibt die akzeptierten Befehlsworte als Text zurueck.
     *
     * @return Die akzeptierten Befehlsworte als Text
     */
    public static String gibBefehlsworteAlsText() {
        String text = "";

        Befehlswort[] befehlsworte = Befehlswort.values();

        for (Befehlswort wort : befehlsworte) {
            if(!(wort.equals(UNBEKANNT))){
                text = text + wort.gibBefehl() + " ";}
        }
        return text;
    }
}
