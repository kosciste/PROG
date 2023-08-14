import java.util.ArrayList;

/**
 * Die Klasse Student verwaltet einen Studenten.
 * 
 * Hinweis: Die Klasse ist absichtlich unvollstaendig
 * 
 * @author meea
 * @version 1.0
 */
public class Student {
	private String name;
	public ArrayList<Double> noten = new ArrayList<Double>();
	
	/**
	 * Erzeugt einen Studenten mit dem spezifizierten Namen
	 * @param name Name des Studenten
	 */
	public Student(String name) {
		this.name = name;
	}

	/**
	 * Gibt den Namen des Studenten zurueck
	 * @return Name
	 */
	public String getName() {
		return name;
		
	}

}
