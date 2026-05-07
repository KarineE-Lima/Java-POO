package ex029;
import java.util.*;

public class Order{
    private List<Item> items;
    private Customer costumer;
    private double basePrice;
    public Order(List<Item> items, Customer costumer, double basePrice){
        this.items = items;
        this.costumer = costumer;
        this.basePrice = basePrice;
    }
    public List<Item> getItems() {
        return items;
    }
    public Customer getCostumer() {
        return costumer;
    }
    public double getBasePrice() {
        return basePrice;
    }
    
}