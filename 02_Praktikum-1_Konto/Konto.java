
/**
 * Write a description of class Konto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Konto
{
    
    private String kontoinhaber;
    private int kontostand;
    private int zinssatz;

    /**
    Erzeugt ein neues Konto mit der Angabe von einem Kontoinhaber.
     */
    public Konto(String kontoinhaber)
    {
        this.kontoinhaber = kontoinhaber;
        this.kontostand = 0;
        this.zinssatz = 2;

    }

    /**
    Erzeugt ein neues Konto mit der Angabe von einem Kontoinhaber und 
    einem Zinssatz!
     */
    public Konto(String kontoinhaber, int zinssatz)
    {
        this.kontoinhaber = kontoinhaber;
        this.kontostand = 0;
        this.zinssatz = zinssatz;// 

    }
    
    
      /**
    Gibt den Wert des Zinssatzes zurück.
     */
    public int gibZinssatz(){

        return zinssatz;
    }
    
      /**
    Aendert den Zinssatz.
     */
    public void aendereZinssatz(int zinssatz){

        this.zinssatz = zinssatz;

    }
    
      /**
    Geld auf das Konto einzahlen.
     */
    public void geldEinzahlen(int betrag){
        
        if (betrag > 0) {
        kontostand += betrag;
        }
        
        else System.out.println("Bitte geben Sie einen postivien Betrag ein!");

    }
    
      /**
    Geld abheben.
     */
    public void geldAbheben(int betrag){
        
        if (betrag > 0) {
        
            if (kontostand - betrag > 0 ) {
            kontostand -= betrag;
            }
            
            else System.out.println("Sie dürfen Ihr Konto nicht überziehen!");
            
        }
        
        else System.out.println("Bitte geben Sie einen positiven Betrag ein!");

        

    }
    
      /**
    Gibt den Jahreszins zurück.
     */
    public int gibJahresZins(){

        int jahreszins = kontostand * zinssatz / 100;
        return jahreszins;
    }
    
      /**
    Zeigt die Kontoinformationen an.
     */
    public void zeigeKontoinformationen(){

        System.out.println("Informationen zum Konto");
        System.out.println("Kontoinhaber: " + kontoinhaber);
        System.out.println("Kontostand: CHF " + kontostand);
        System.out.println("Zinssatz: " + zinssatz);

    }
   
}
