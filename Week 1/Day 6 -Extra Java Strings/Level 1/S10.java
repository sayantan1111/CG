import java.util.*;

class S10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        String resultString = "";

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) != charToRemove) {
                resultString += inputString.charAt(i);             }
        }

        System.out.println("String after removing '" + charToRemove + "': " + resultString);
        scanner.close();    }
}


