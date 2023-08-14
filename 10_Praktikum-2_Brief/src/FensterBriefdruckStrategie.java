import java.util.Calendar;

public class FensterBriefdruckStrategie implements Briefdruckstrategie {
    private String einzug;

    public FensterBriefdruckStrategie(){
        char[] whitespace = new char[20];
        for(int i = 0; i < 20; i++) {
            whitespace[i] = ' ';
        }
        einzug = new String(whitespace);
    }

    @Override
    public void druckeBrief(Brief brief) {
        System.out.println(brief.getSender().getVorname() + " " + brief.getSender().getNachname());
        System.out.println(brief.getSender().getStrasse() + " " + brief.getSender().getHausnummer());
        System.out.println(brief.getSender().getPlz() + " " + brief.getSender().getOrt());
        System.out.println();
        System.out.println(brief.getEmpfaenger().getVorname() + einzug + brief.getEmpfaenger().getNachname());
        System.out.println(brief.getEmpfaenger().getStrasse() + einzug + brief.getEmpfaenger().getHausnummer());
        System.out.println(brief.getEmpfaenger().getPlz() + einzug + brief.getEmpfaenger().getOrt());
        System.out.println();
        System.out.println(brief.getSender().getOrt() + ", " + brief.getInhalt().getDatum().get(Calendar.DAY_OF_WEEK_IN_MONTH)
                + "." + brief.getInhalt().getDatum().get(Calendar.MONTH) + "." + brief.getInhalt().getDatum().get(Calendar.YEAR));
        System.out.println();
        System.out.println(brief.getInhalt().getTitel());
        System.out.println();
        System.out.println(brief.getInhalt().getAnrede() + " " + brief.getEmpfaenger().getNachname());
        System.out.println();
        System.out.println(brief.getInhalt().getText());
        System.out.println();
        System.out.println("Freundliche Grüsse");
        System.out.println();
        System.out.println(brief.getSender().getVorname() + " " + brief.getSender().getNachname());
    }
}
