import java.util.ArrayList;

/**
 * Die Klasse NotenBerechnungSchlecht dient zum Verwalten, Berechnen und Anzeigen
 * der Semesternote in der Vorlesung Programmieren 1.
 * 
 * Hinweis: Diese Klasse soll als schlechtes Beispiel dienen.
 * 
 * @author meea
 * @version 1.0
 */
public class NotenBerechnungSchlecht {
	public ArrayList<Student> studenten = new ArrayList<Student>();
	public String klasse = "IT13d";
	public String dozent = "Kent Beck";

	/**
	 * @param args Keine Parameter vorgesehen
	 */
	public static void main(String[] args) {
		new NotenBerechnungSchlecht().start();
	}
	
	/**
	 *  Gibt die Studierenden und ihre Noten in der Vorlesung Programmieren1 auf
	 *  der Konsole aus
	 */
	private void start(){
		testdatenProg1();
		
		// Noten ausgeben
		System.out.println("Programmieren 1");
		System.out.println("Semesternote Klasse "+klasse);
		System.out.println("Dozent "+dozent);
		System.out.println("*************************");
		
		for(Student s : studenten){
			System.out.println(s.getName()+" "+semesternoteProg1(s));
		}	
	}
	
	/**
	 *  Hilfsmethode zum Erzeugen von Studenten und Noten
	 */
	private void testdatenProg1() {
		// Testdaten
		Student student = new Student("Peter Muster");
		studenten.add(student);
		
		student.noten.add(new Double(4.5));
		student.noten.add(new Double(4.0));
		student.noten.add(new Double(4.5));
		
		student = new Student("Lara Croft");
		studenten.add(student);
		
		student.noten.add(new Double(5.5));
		student.noten.add(new Double(6.0));
		student.noten.add(new Double(4.5));
		
		student = new Student("Pipi Langstrumpf");
		studenten.add(student);
		
		student.noten.add(new Double(5.5));
	}
	
	/**
	 * Berechnet die Semesternote für einen Student
	 * @param Student
	 * @return Semesternote von 1 bis 6. Falls ungültig, wird -1 zurückgegeben
	 */
	double semesternoteProg1(Student student){
		//Eine Semesternote darf nur berechnet werden,
		//falls der Student min. 3 Noten hat.
		//Falls keine gueltige Note, wird -1 zurueckgegeben
		
		if (student.noten.size() < 3){
			return -1;
		}
		//Semesternote berechnen
		double note = 0;
		for (Double d: student.noten){
			note += d;
		}
		note /= student.noten.size();
		note = Math.round(note*100)/100;
		return note;
	}
}
