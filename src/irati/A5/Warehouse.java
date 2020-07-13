package irati.A5;
import java.util.*;

public class Warehouse {
    private ArrayList <String> inventory;

    public void displayInventory(){
        for (String item: inventory){
            System.out.println(item);
        }
    }

    public void setInventory(ArrayList<String> inventory) {
        this.inventory = inventory;
    }

    public void fillInventory(String item){
        inventory.add(item);
    }

    public ArrayList<String> getInventory(){
        return inventory;
    }

}
