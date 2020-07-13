package irati.A6;

public class Book extends Product {
    @Override
    public String toString() {
        return "Name of the Book: " + name + "\nDescription of the Book: " + description + "\nPrice: " + price + " Euros.\n";
    }
}
