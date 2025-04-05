class Product {
    String productName;
    double price;
    static int totalProducts = 0; 

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

   public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 120000.0);
        Product product2 = new Product("Mouse", 250.0);
        Product product3 = new Product("Keyboard", 500.0);

        product1.displayProductDetails();
        System.out.println();

        product2.displayProductDetails();
        System.out.println();

        product3.displayProductDetails();
        System.out.println();

        Product.displayTotalProducts();
    }
}