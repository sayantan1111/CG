import java.util.*;
class M21{
        public static int[] getFactors(int num) {
        int count = 0;
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }
    
    public static long prodFactors(int[] factors) {
        long prod = 1;
        for (int f : factors) {
            prod *= f;
        }
        return prod;
    }
    
    public static int sumSqFactors(int[] factors) {
        int sumSq = 0;
        for (int f : factors) {
            sumSq += Math.pow(f, 2);
        }
        return sumSq;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        
        int[] factors = getFactors(num);
        
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum of factors: " + sumFactors(factors));
        System.out.println("Product of factors: " + prodFactors(factors));
        System.out.println("Sum of squares of factors: " + sumSqFactors(factors));
    }
}
