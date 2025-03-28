import java.util.Scanner;
class Level115{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the unit price of the item: ");
        double unitPrice = s.nextDouble();
        
        System.out.print("Enter the quantity to be bought: ");
        int quantity = s.nextInt();
        
        double totalPrice = unitPrice * quantity;
        
        System.out.printf("The total purchase price is INR "+totalPrice+"if the quantity "+quantity+"and unit price is INR "+unitPrice);
        
        s.close();
    }
}
