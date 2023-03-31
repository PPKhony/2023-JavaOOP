package final6_Reportable;

public class Item implements Reportable {
    private String name;
    private double weight;
    private Double score;

    public Item(String name, double weight) {
        this.name = name;
        this.weight = weight;
        score = 100 - weight;
    }
    
    public void report() {
        System.out.println("Item name "+ name + " with weight " + weight + " with score " + score);
    }
}
