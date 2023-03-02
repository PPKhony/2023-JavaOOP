package lab07midterm;

public class ObjectCreation {
    private int number;
    private String name;
    private String description;

    public void showInfo() {
        System.out.println(name);
        System.out.println(number);
        System.out.println(description);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }
    public static void main(String[] args) {
        ObjectCreation obj01 = new ObjectCreation();
       
        obj01.setName("Person");
        obj01.setNumber(5);
        obj01.setDescription("ComScience");
        //แบบที่ 1
        System.out.println(obj01.getName());
        System.out.println(obj01.getNumber());
        System.out.println(obj01.getDescription());

        //แบบที่ 2
        obj01.showInfo();
    }
}
