import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = s.nextInt();
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                personData[i][0] = s.nextDouble();
            } while (personData[i][0] <= 0);
            
            do {
                System.out.print("Enter height (m) of person " + (i + 1) + ": ");
                personData[i][1] = s.nextDouble();
            } while (personData[i][1] <= 0);
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\nHeight(m) | Weight(kg) | BMI | Status");
        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][1] + "     | " + personData[i][0] + "     | " + personData[i][2] + " | " + weightStatus[i]);
        }
        
        s.close();
    }
}
