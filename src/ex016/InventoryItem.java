package ex016;

public class InventoryItem {
    private String itemCode;
    private String description;
    private double unitPrice;
    private long quantityInStock;
    private long minimumStockLevel;

    public InventoryItem(String itemCode, String description, double unitPrice){
        this.itemCode = itemCode;
        this.description = description;
        this.unitPrice = unitPrice;
    }
    public InventoryItem(String itemCode, String description, double unitPrice, long quantityInStock){
        this(itemCode, description, unitPrice);
        this.quantityInStock = quantityInStock;
    }
    public InventoryItem(String itemCode, String description, double unitPrice, long quantityInStock, long minimumStockLevel){
        this(itemCode, description, unitPrice, quantityInStock);
        this.minimumStockLevel = minimumStockLevel;
    }

    public void applyDiscount(double percentage){
        setUnitPrice(this.unitPrice - (this.unitPrice * percentage));
    }

    public boolean updateStock(int quantity){
        var res = setQuantityInStock(quantityInStock + quantity);
        if(isBelowMinimumStock()){
            System.out.println("Please, buy more itens!");
        }
        return res;
    }
    public void updateStock(int quantity, String reason){
        if(updateStock(quantity))
            System.out.println("Update stock: " + reason);
    }

    public boolean isBelowMinimumStock(){
        return quantityInStock < minimumStockLevel;
    }

    public String getItemCode(){
        return this.itemCode;
    }
    public String getDescription(){
        return this.description;
    }
    public double getUnitPrice(){
        return this.unitPrice;
    }
    public long getQuantityInStock(){
        return this.quantityInStock;
    }
    public long getMinimusStockLevel(){
        return this.minimumStockLevel;
    }
    public void setItemCode(String itemCode){
        this.itemCode = itemCode;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setUnitPrice(double unitPrice){
        if(unitPrice <= 0){
            System.out.println("The price cannot be negative!");
            return;
        }
        this.unitPrice = unitPrice;
    }
    public boolean setQuantityInStock(long quantityInStock){
        if(quantityInStock < 0){
            System.out.print("Quantity cannot be negative!");
            return false;
        }
        this.quantityInStock = quantityInStock;
        return true;
    }
    public void setMinimusInStockLevel(long minimusStockLevel){
        if(minimusStockLevel < 0){
            System.out.println("The minimus stock level cannot be negative!");
            return;
        }
        this.minimumStockLevel = minimusStockLevel;
    }
    public String toString(){
        return "Item Code: " + getItemCode() + " Description: " + getDescription() + "  QuantityInStock:" + getQuantityInStock() + " UnitPrice: " + getUnitPrice() + " MinimusStockLevel " + getMinimusStockLevel();
    }

}