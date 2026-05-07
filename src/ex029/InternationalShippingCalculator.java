package ex029;

import java.util.List;

public class InternationalShippingCalculator implements IShippingCalculator{
    private double base = 15.0;

    @Override
    public double calculate(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getPreco();
        }
        return total += base;

    }
    
}
