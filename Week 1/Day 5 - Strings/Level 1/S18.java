import java.util.Scanner;

class S18{

    public static void generateException(String[] names) {
        System.out.println("Generating ArrayIndexOutOfBoundsException...");
        System.out.println(names[names.length]); 

    public static void handleException(String[] names) {
        System.out.println("Handling ArrayIndexOutOfBoundsException...");
        try {
            System.out.println(names[names.length]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.err.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int numNames = s.nextInt();
        s.nextLine(); // Consume newline

        String[] names = new String[numNames];
        for (int i = 0; i < numNames; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        try {
            generateException(names);
        } catch (Exception e) {
            System.err.println("\nUncaught Exception: " + e);
        }
        
        handleException(names);

        s.close();
    }
}