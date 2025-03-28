import java.util.Scanner;

class A25{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        
        int temp = num, count = 0;
        
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        
        int[] digits = new int[count];
        temp = num;
                for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        
        System.out.print("Reversed Number: ");
        for (int d : digits) {
            System.out.print(d);
        }
        
        s.close();
    }
}
