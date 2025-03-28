import java.util.Scanner;

class S15 {
    String inputString;
    public S15(String inputString) {
        this.inputString = inputString;
    }
    public void generateException() {
        try {
            System.out.println("Generating StringIndexOutOfBoundsException...");
            char character = inputString.charAt(inputString.length()); 
            System.out.println("Character at the specified index: " + character);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Caught StringIndexOutOfBoundsException in generateException(): " + e.getMessage());
        }
    }
    public void handleException() {
        System.out.println("Handling StringIndexOutOfBoundsException...");
        try {
            char character = inputString.charAt(inputString.length());
            System.out.println("Character at the specified index: " + character);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Caught StringIndexOutOfBoundsException in handleException(): " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        S15 stringExample = new S15(input);

        System.out.println("\nCalling method to generate exception:");
        stringExample.generateException();

        System.out.println("\nCalling method to handle exception:");
        stringExample.handleException();

        scanner.close();
    }
}
