package irati.A6;

public class Product {
    String name;
    String description;
    int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name of the Product: " + name + "\nDescription of the Product: " + description + "\nPrice: " + price + " Euros.\n";
    }
}
