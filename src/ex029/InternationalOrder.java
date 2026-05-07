package ex029;

import java.util.List;

public class InternationalOrder extends Order{
    public InternationalOrder(List<Item> items, Customer costumer){
        super(items, costumer, 15.00);
    }
}
