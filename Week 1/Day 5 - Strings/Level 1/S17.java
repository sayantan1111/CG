import java.util.*;
class S17{
    public static void generateException() {
        String text = "abc";
        int num = Integer.parseInt(text);
        System.out.println(num);
    }

    public static void handleException() {
        String text = "abc";
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException caught: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Generic Exception caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Generating Exception:");
        try {
            generateException();
        } catch (Exception e) {
            System.err.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\nHandling Exception:");
        handleException();
    }
}