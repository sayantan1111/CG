import java.util.*;

class S110 {
    public static String convert(String str) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current >= 'A' && current <= 'Z') {
                s.append((char) (current + 32));
            } else {
                s.append(current);
            }
        }
        return s.toString();
    }

    public static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a text:");
        String input = s.nextLine();
        s.close();

        String manualLowerCase = convert(input);
        String builtInLowerCase = input.toLowerCase();

        boolean areEqual = compare(manualLowerCase, builtInLowerCase);

        System.out.println("Manual Lowercase: " + manualLowerCase);
        System.out.println("Built-in Lowercase: " + builtInLowerCase);
        System.out.println("Are the two strings equal? " + areEqual);
    }
}