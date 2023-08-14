public class Event {

    private Kuenstler kuenstler;
    private Ticketkategorie ticketKat1;
    private Ticketkategorie ticketKat2;
    private Ticketkategorie ticketKat3;

    public Event(){}

    public Event(Kuenstler kuenstler, Ticketkategorie ticketKat1, Ticketkategorie ticketKat2, Ticketkategorie ticketKat3)
    {

        this.kuenstler = kuenstler;
        this.ticketKat1 = ticketKat1;
        this.ticketKat2 = ticketKat2;
        this.ticketKat3 = ticketKat3;
    }

    public void aendereKuenstler(Kuenstler kuenstler){

        this.kuenstler = kuenstler;
    }

    public void ticketKaufen(int anzahl, Ticketkategorie ticketKat){

        ticketKat.ticketKaufen(anzahl);

    }

    public void gibInfos(){
        System.out.println("Künstler: " + kuenstler.gibKuenstlerName() + ", Gage: CHF " + kuenstler.gibGage());
        System.out.println("VIP-Tickets: " + (ticketKat1.gibVerkaufteTickets() + " von " + (ticketKat1.gibAlteAnzahlTickets()) + " verkauft, Einnahmen: CHF " + ((ticketKat1.gibVerkaufteTickets()) * ticketKat1.gibPreis())));
        System.out.println("Tribuene: " + (ticketKat2.gibVerkaufteTickets() - ticketKat2.gibAnzahlTickets()) + " von " + (ticketKat2.gibAlteAnzahlTickets()) + " verkauft, Einnahmen: CHF " + (ticketKat2.gibVerkaufteTickets() * ticketKat2.gibPreis()));
        System.out.println("Innenraum: " + (ticketKat3.gibVerkaufteTickets() - ticketKat3.gibAnzahlTickets()) + " von " + (ticketKat3.gibAlteAnzahlTickets()) + " verkauft, Einnahmen: CHF " + (ticketKat3.gibVerkaufteTickets() * ticketKat3.gibPreis()));
        System.out.println("Gesamteinnahmen: CHF " + (ticketKat1.gibGesamteEinnahmen()+ticketKat2.gibGesamteEinnahmen()+ticketKat3.gibGesamteEinnahmen()));
        System.out.println("Gewinn: CHF" + (ticketKat1.gibGesamteEinnahmen()+ticketKat2.gibGesamteEinnahmen()+ticketKat3.gibGesamteEinnahmen()- kuenstler.gibGage()));
    }
}