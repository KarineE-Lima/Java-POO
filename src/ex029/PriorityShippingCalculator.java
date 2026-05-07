package ex029;

import java.util.List;

public class PriorityShippingCalculator implements IShippingCalculator{
    private double base = 10.0;

    @Override
    public double calculate(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getPreco();
        }
        return total += base;

    }
    
}
