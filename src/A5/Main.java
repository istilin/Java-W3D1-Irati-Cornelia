package A5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        ArrayList <String> newArray = new ArrayList<>();
        warehouse.setInventory(newArray);
        warehouse.fillInventory("hammer");
        warehouse.fillInventory("chair");
        warehouse.fillInventory("table");
        warehouse.fillInventory("lamp");
        warehouse.fillInventory("chainsaw");
        warehouse.displayInventory();
        System.out.println(warehouse.getInventory());
    }
}
