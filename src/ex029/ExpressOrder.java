package ex029;

import java.util.List;

public class ExpressOrder extends Order{
    public ExpressOrder(List<Item> items, Customer costumer){
        super(items, costumer, 10.0);
    }
}
