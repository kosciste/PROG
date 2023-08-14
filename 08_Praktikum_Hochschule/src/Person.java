public class Person {

    private String id;
    private String name;

    public Person(String name, String id) {
        this.id = id;
        this.name = name;

    }

    public String gibInfo(){

        return "ID: " + id + "  Name: " + name;

    }




}
