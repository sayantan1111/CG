import java.util.*;
class A16{
public static void main(String[]args){
  Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;
        
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter the height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }
                double mean = sum / 11;
        
        System.out.println("\nThe mean height of the football team is: " + mean);
        
        scanner.close();
    }
}
