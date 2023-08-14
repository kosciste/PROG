public class Student extends Person {

    private int anzahlCredits;

    public Student(String name, String id){
        super(name, id);
        this.anzahlCredits = 0;


    }

    public int gibCredits(){

        return anzahlCredits;
    }

    public void erhoeheCredits(int wert){

        anzahlCredits += wert;

    }

}
