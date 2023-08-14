import java.util.Calendar;

/**
 * Diese Klasse implementiert ein Briefprogramm.
 * 
 * @author tebe
 */
public class Briefprogramm {


	/**
   * main Methode.
   * @param args Es werden keine Kommandozeilenparameter verwendet
   */
	public static void main(String[] args) {

		Adresse sender = new Adresse("Max", "Mustermann", "Musterstrasse",
				12, 3460, "Musterhausen");
		Adresse empfaenger = new Adresse("Felix", "Müller", "Schaffhauserstrasse",
				5, 8200, "Schaffhausen");
		Inhalt inhalt = new Inhalt(Calendar.getInstance(),"Bewerbung", "Sehr geehrter Herr",
				"Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod");
		Brief brief = new Brief(sender, empfaenger, inhalt);
		Briefdrucker standardBriefdrucker = new Briefdrucker(new StandardBriefdruckStrategie());
		Briefdrucker fensterBriefdrucker = new Briefdrucker(new FensterBriefdruckStrategie());

		standardBriefdrucker.druckeBrief(brief);
		System.out.println();
		standardBriefdrucker.druckeBrief(brief);

	}
}