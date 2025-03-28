import java.util.*;
class A15{
public static void main(String [] args){
 Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to generate its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();
        
        int[] Result = new int[4];
        for (int i = 6; i <= 9; i++) {
            Result[i - 6] = number * i;
        }
        
        System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " x " + i + " = " + Result[i - 6]);
        }
        
        scanner.close();
    }
}
