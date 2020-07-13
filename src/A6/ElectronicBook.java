package A6;

public class ElectronicBook extends Book{
    private String URL;

    public void setURL(String URL) {
        this.URL = URL;
    }

    @Override
    public String toString() {
        return "Name of the Electronic Book: " + name + "\nDescription of the Electronic Book: " + description + "\nPrice: " + price + " Euros.\nURL to the pdf: " + URL + "\n";
    }
}
