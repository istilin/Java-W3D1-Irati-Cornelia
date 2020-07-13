package irati.A6;

public class Pet extends Product {
    @Override
    public String toString() {
        return "Name of the Pet: " + name + "\nDescription of the Pet: " + description + "\nPrice: " + price + " Euros.\n";
    }
}
