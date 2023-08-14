/**
 * Diese Klasse implementiert einen Briefdrucker
 * 
 * @author tebe
 */
public class Briefdrucker {
  private Briefdruckstrategie briefdruckstrategie;

  public Briefdrucker(Briefdruckstrategie briefdruckstrategie){

      this.briefdruckstrategie = briefdruckstrategie;
  }

  public void druckeBrief(Brief brief){

      briefdruckstrategie.druckeBrief(brief);
  }
	
}
