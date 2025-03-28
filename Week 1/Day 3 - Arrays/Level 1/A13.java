import java.util.*;
class A13{
public static void main(String[]args){
 Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();
        int[] table = new int[10];
        
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i+1);
        }
        
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " x " + (i + 1) + " = " + table[i]);
        }
        
        scanner.close();
    }
}
