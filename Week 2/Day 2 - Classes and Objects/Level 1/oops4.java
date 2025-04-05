public class Item {
    private String itemCode;
    private String itemName;
    private double price;

    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price:" + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item1 = new Item("I1", "Laptop", 1200.00);
        Item item2 = new Item("I2", "Mouse", 25.00);

        item1.displayItemDetails();
        System.out.println("Total cost for 2 laptops: " + item1.calculateTotalCost(2));

        item2.displayItemDetails();
        System.out.println("Total cost for 5 mouse: " + item2.calculateTotalCost(5));
    }
}