class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    double calculateItemCost() {
        return price * quantity;
    }
    void display(){
	System.out.println("Name: " + itemName);

	System.out.println("Price: " + price);
	System.out.println("Quantity: " + quantity);


}
public static void main(String[]args){
CartItem item1 = new CartItem("T-shirt", 1900, 2);

item1.display();
	System.out.println("Total Cost: " + item1.calculateItemCost());}

}