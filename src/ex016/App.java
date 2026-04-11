package ex016;
import java.util.*;

public class App {
    public static void main(String []args){
        List<InventoryItem> inventoryItems = new ArrayList<>();
        inventoryItems.add(new InventoryItem("c5748", "Camisa pollo", 75.90, 20, 5));
        inventoryItems.add(new InventoryItem("c5749", "Regata", 20.90, 20, 5));
        inventoryItems.get(0).updateStock(-16, "Venda de item");
        System.out.println(inventoryItems.toString());
    }
}
