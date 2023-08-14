public class Anwendung {
    private Parser parser;
    private Kontroller kontroller;


    public static void main(String args[]){


        Anwendung anwendung = new Anwendung();
        anwendung.start();


        }


        public Anwendung(){

        parser = new Parser();
        kontroller = new Kontroller();
        }


        public void start(){

        willkommensTextAusgeben();;
        boolean laeuft = true;
        while(laeuft){


            Befehl befehl = parser.liefereBefehl();
           laeuft =  kontroller.verarbeiteBefehl(befehl);
        }

        System.out.println("Das Spiel wurde beendet");




        }

        public void willkommensTextAusgeben(){
            System.out.println("Willkommen zum Spiel XY");
            System.out.println("Folgende Befehle kannst du eingeben:");
            System.out.println(Befehlswort.gibBefehlsworteAlsText());


        }


    }

