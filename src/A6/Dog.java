package A6;

public class Dog extends Pet {
    private String sound;

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Name of the Dog: " + name + "\nDescription of the Dog: " + description + "\nPrice: " + price + " Euros.\nSound of the Dog: " + sound + "\n";
    }
}
