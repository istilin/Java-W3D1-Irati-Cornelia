package A6;

public class PhysicalBook extends Book{
    private int weight;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name of the Physical Book: " + name + "\nDescription of the Physical Book: " + description + "\nPrice: " + price + " Euros.\nWeight: " + weight + "g.\n";
    }
}
