package ex029;

import java.util.*;

public class OrderProcessor {
    public ProcessingResult processOrder(Order order, IProcessingStrategy strategy, IShippingCalculator calculator){
        strategy.process();
        System.out.println("Items: ");
        for (Item item : order.getItems()) 
            System.out.println("Item: " + item.getDescricao() + "Price: " + item.getPreco());
        System.out.println("Total: " + calculator.calculate(order.getItems()));
        return new ProcessingResult();
    }
    public List<ProcessingResult> processOrderBatch(List<Order> orders, Map<Order, IProcessingStrategy> strategyMap, IShippingCalculator calculator){
        List<ProcessingResult> results = new ArrayList<>();
        strategyMap.forEach((Order, IProcessingStrategy)->{
            results.add(processOrder(Order, IProcessingStrategy, calculator));
        });

        return results;
    }
}
