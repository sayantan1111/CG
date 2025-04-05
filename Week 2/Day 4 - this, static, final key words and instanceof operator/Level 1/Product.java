public class Product {

    public static double discount = 0.10;
    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductID() {
        return productID;
    }

    public double calculateDiscountedPrice() {
        return price * (1 - discount);
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + this.productName);
        System.out.println("Product ID: " + this.productID);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("Discounted Price: " + calculateDiscountedPrice());
    }

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200.00, 1, "LAP123");
        Product product2 = new Product("Mouse", 25.00, 5, "MOU456");

        System.out.println("Current Discount: " + (Product.discount * 100) + "%");

        System.out.println("\nProduct 1 Details:");
        if (product1 instanceof Product) {
            product1.displayProductDetails();
        }

        System.out.println("\nProduct 2 Details:");
        if (product2 instanceof Product) {
            product2.displayProductDetails();
        }

        Product.updateDiscount(0.15);
        System.out.println("\nUpdated Discount: " + (Product.discount * 100) + "%");

        System.out.println("\nProduct 1 Details after discount update:");
        if (product1 instanceof Product) {
            product1.displayProductDetails();
        }

        System.out.println("\nProduct 2 Details after discount update:");
        if (product2 instanceof Product) {
            product2.displayProductDetails();
        }
    }
}