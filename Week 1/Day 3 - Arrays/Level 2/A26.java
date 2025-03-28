import java.util.Scanner;

class A26{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = s.nextInt();
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter weight (kg) of person " + (i + 1) + ": ");
            weight[i] = s.nextDouble();
            System.out.println("Enter height (m) of person " + (i + 1) + ": ");
            height[i] = s.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);
            
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        
        System.out.println("Height(m) | Weight(kg) | BMI | Status");
        for (int i = 0; i < n; i++) {
            System.out.println(height[i] + "     | " + weight[i] + "     | " + bmi[i] + " | " + status[i]);
        }
        
        s.close();
    }
}
