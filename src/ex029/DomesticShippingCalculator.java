package ex029;

import java.util.List;

public class DomesticShippingCalculator implements IShippingCalculator{
    private double base = 5.0;

    @Override
    public double calculate(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getPreco();
        }
        return total += base;

    }
    
}
