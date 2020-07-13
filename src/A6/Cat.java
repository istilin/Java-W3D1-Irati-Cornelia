package A6;

public class Cat extends Pet {
    private String ignores;

    public void setIgnores(String ignores) {
        this.ignores = ignores;
    }

    @Override
    public String toString() {
        return "Name of the Cat: " + name + "\nDescription of the Cat: " + description + "\nPrice: " + price + " Euros.\nThe cat will ignore you by: " + ignores + "\n";
    }
}
