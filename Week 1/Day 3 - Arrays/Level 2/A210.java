import java.util.Scanner;

class A210 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = s.nextInt();       
int[] freq = new int[10];
int temp = num; 
while (temp > 0) {
int d = temp % 10;
freq[d]++;
temp /= 10;
}
System.out.println("Digit | Frequency");
for (int i = 0; i < 10; i++) {
if (freq[i] > 0) {
System.out.println("  " + i + "   |   " + freq[i]);
}}
s.close();
}}
