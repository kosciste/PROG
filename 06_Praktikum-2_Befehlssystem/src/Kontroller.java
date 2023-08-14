/**
 * Diese Klasse verarbeitet Befehle vom Typ
 * {@link Befehl Befehl} und löst die dazu 
 * passenden Aktionen aus.
 * 
 * @author tebe
 *
 */
public class Kontroller {
	/**
	 * Verarbeite einen gegebenen Befehl
	 * 
	 * @param befehl
	 *            Der zu verarbeitende Befehl.
	 * @return 'false', wenn ein Abbruchbefehl verarbeitet wurde
	 */
	public boolean verarbeiteBefehl(Befehl befehl) {
		boolean macheWeiter = true;
		String befehlswort = befehl.gibBefehlswort();
		if (Befehlswort.istBefehl(befehlswort)) {

			if (befehlswort.equals(Befehlswort.GEHE.gibBefehl())) {
				System.out.println(Befehlswort.GEHE.toString() + befehl.gibZweitesWort() + " wird ausgefuehrt");
			} else if (befehlswort.equals(Befehlswort.HILFE.gibBefehl())) {
				System.out.println("Gueltige Befehle: "
						+ Befehlswort.gibBefehlsworteAlsText());
			} else if (befehlswort.equals(Befehlswort.BEENDEN.gibBefehl())) {
				System.out.println("Befehl" + Befehlswort.BEENDEN.toString() + "wird ausgefuehrt.");
				macheWeiter = false;
			} else {
				System.out.println("Befehlswort ohne zugehoerige Aktion: Abbruch.");
				macheWeiter = false;
			}
		} else {
			System.out.println("Ich weiss nicht, was Sie meinen...");
		}
		return macheWeiter;
	}
}
