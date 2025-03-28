import java.util.Scanner;

class S16{

    public static void generateException(String text) {
        String sub = text.substring(5, 2);
        System.out.println(sub);
    }

    public static void handleException(String text) {
        try {
            String sub = text.substring(5, 2);
            System.out.println(sub);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (RuntimeException e) {
             System.out.println("Generic RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = s.nextLine();
        s.close();

        System.out.println("Generating Exception...");
        System.out.println("Handling Exception...");
        handleException(inputString);
    }
}