import java.util.*;
public class S6{

    public static int countSubstringOccurrences(String text, String substring) {
        if (text == null || substring == null || substring.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        return count;
    }

    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
        String text = "This is a test string. This string contains the word string multiple times.";
        String substring = "string";
        int occurrences = countSubstringOccurrences(text, substring);

        System.out.println("The substring \"" + substring + "\" appears " + occurrences + " times in the text.");
    }
}