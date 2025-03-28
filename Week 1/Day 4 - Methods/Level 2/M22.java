import java.util.Scanner;

class M22{
        public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }
        public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        sc.close();
        
        if (n <= 0) {
            System.out.println("Please enter a natural number (n > 0).");
            return;
        }
        
        int sumRec = sumRecursive(n);
        int sumForm = sumFormula(n);
        
        System.out.println("Sum using recursion: " + sumRec);
        System.out.println("Sum using formula: " + sumForm);
        
        if (sumRec == sumForm) {
            System.out.println("Both results matched");
        } else {
            System.out.println("Mismatch in results");
        }
    }
}
