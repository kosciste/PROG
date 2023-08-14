import java.util.Calendar;

public class StandardBriefdruckStrategie implements  Briefdruckstrategie{

    @Override
    public void druckeBrief(Brief brief) {
        System.out.println(brief.getSender().getVorname() + " " + brief.getSender().getNachname());
        System.out.println(brief.getSender().getStrasse() + " " + brief.getSender().getHausnummer());
        System.out.println(brief.getSender().getPlz() + " " + brief.getSender().getOrt());
        System.out.println();
        System.out.println(brief.getEmpfaenger().getVorname() + " " + brief.getEmpfaenger().getNachname());
        System.out.println(brief.getEmpfaenger().getStrasse() + " " + brief.getEmpfaenger().getHausnummer());
        System.out.println(brief.getEmpfaenger().getPlz() + " " + brief.getEmpfaenger().getOrt());
        System.out.println();
        System.out.println(brief.getSender().getOrt() + ", " + brief.getInhalt().getDatum().get(Calendar.DAY_OF_WEEK_IN_MONTH)
        + "." + brief.getInhalt().getDatum().get(Calendar.MONTH) + "." + brief.getInhalt().getDatum().get(Calendar.YEAR));
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
