public class Dozent extends Person {
    private String bueronummer;
    private String telefonnummer;

    public Dozent(String name, String id, String bueronummer, String telefonnummer) {
       super(name, id);
       this.bueronummer = bueronummer;
       this.telefonnummer = telefonnummer;
    }

    public String gibBuero(){

        return bueronummer;

    }

    public String gibTelefonnummer(){

        return telefonnummer;

    }
}
