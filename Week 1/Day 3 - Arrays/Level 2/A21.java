import java.util.Scanner;

class A21{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int emp= 10;

        double[] salaries = new double[emp];
        double[] yearsOfService = new double[emp];
        double[] bonuses = new double[emp];
        double[] newSalaries = new double[emp];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        for (int i = 0; i <emp; i++) {
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                double salary = scanner.nextDouble();
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                double years = scanner.nextDouble();

                if (salary > 0 && years >= 0) {
                    salaries[i] = salary;
                    yearsOfService[i] = years;
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a positive salary and non-negative years of service.");
                }
            }
        }
        for (int i = 0; i <emp; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\nEmployee Salary Details:");
        for (int i = 0; i <emp; i++) {
            System.out.println("Employee " + (i + 1) + " - Old Salary: " + salaries[i] + ", Bonus: " + bonuses[i] + ", New Salary: " + newSalaries[i]);
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
