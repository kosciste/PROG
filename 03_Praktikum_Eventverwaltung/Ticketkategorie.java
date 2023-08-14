public class Ticketkategorie {

    private String bezeichnung;
    private int ticketpreis;
    private int ticketanzahl;
    private int alteticketanzahl;

    /**
     * Erstellt ein Ticket mit einer Kategorie, einem Preis und der Anzahl
     * der Tickets.
     */
    public Ticketkategorie(String bezeichnung, int ticketpreis, int ticketanzahl)
    {

        this.bezeichnung = bezeichnung;
        this.ticketpreis = ticketpreis;
        this.ticketanzahl = ticketanzahl;
        this.alteticketanzahl = ticketanzahl;

    }

    public void ticketKaufen(int anzahl)

    {
            
        if ((ticketanzahl-=anzahl)<0) {
        System.out.println("Fehler");
        }
        
        else {
        ticketanzahl-=anzahl;
        }
        

    }

    public int gibPreis()

    {

        return ticketpreis;
    }
    
    public int gibAnzahlTickets()
    {
    return ticketanzahl;
    
    }
    
    public int gibAlteAnzahlTickets()
    {
    return alteticketanzahl;
    
    }
    
    public String gibKategorieBezeichnung(){
    
    return bezeichnung;
    }
    
    public int gibVerkaufteTickets(){
    
    return (alteticketanzahl - ticketanzahl);
    }
    
    public int gibGesamteEinnahmen() {
    
        return (alteticketanzahl - ticketanzahl) * ticketpreis;
    
    }

}