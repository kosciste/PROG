public class Kuenstler{

    private String name;
    private int gage;

    /**
     * Erstellt einen neuen Künstler.
     */
    public Kuenstler(String name, int gage){
        aendereKuenstler(name, gage);

    }
    
    /**
     * Ändert die Attribute eines Künstlers.
     */
    public void aendereKuenstler(String name, int gage) {
        this.name = name;
        this.gage = gage;

    }
    
    public String gibKuenstlerName()
    {
    return name;
    }
    
    public int gibGage(){
    
        return gage;
    
    }

}