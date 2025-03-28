import java.util.Scanner;
public class M33{
    public static int findCount(int n){
        int count=0;
        while(n!=0){
            count+=1;
            n/=10;
        }
        return count;
    }
    public static int[] storeArray(int n) {
        int count = findCount(n);
        int[] digits = new int[count];
        int index = count - 1; 
    
        while (n != 0) {
            digits[index] = n % 10; 
            n /= 10;                
            index--;                 
        }
        
        return digits;
    }
    public static int sumArray(int[] digits){
        int sum=0;
        for(int n:digits){
            sum+=n;
        }
        return sum;
    }
    public static int sumOfSquare(int[] digits){
        int sum=0;
        for(int n:digits){
            sum+=Math.pow(n,2);
        }
        return sum;
    }
    public static boolean isHarshad(int n){
        int[] digits=storeArray(n);
        int sum=sumArray(digits);
        return n%sum==0; 
    }
    public static int[][] digitFrequency(int[] digits){
        int[][] freq= new int[10][2];
        for(int i=0;i<10;i++){
            freq[i][0]=i;
            freq[i][1]=0;
        }
        for(int n:digits){
            freq[n][1]++;
        }
        return freq;
    }
    public static boolean isDuck(int[] arr){
        for(int n:arr){
            if(n==0) return true;
        }
        return false;
    }
    public static boolean isArmstrong(int n){
        int sum=0;
        int count=findCount(n);
        int temp=n;
        while(temp!=0){
            int digit=temp%10;
            sum=sum+(int)Math.pow(digit, count);
            temp/=10;
        }
        return (n==sum);
    }
    public static int[] largeAndSecondLarge(int[] arr){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int n:arr){
            if(n>first){
                second=first;
                first=n;
            }
            else if(n>second && n!=first) second=n;
        }
        return new int[]{first,second};

    }
    public static int[] smallAndSecondSmall(int[] arr){
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int n:arr){
            if(n<first){
                second=first;
                first=n;
            }
            else if(n<second && n!=first) second=n;
        }
        return new int[]{first,second};

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int[] digits=storeArray(number);
        int sum=sumArray(digits);
        System.out.println("Sum of digits: "+sum);
        int sumsquare=sumOfSquare(digits);
        System.out.println("Sum of square of digits: "+sumsquare);
        if(isHarshad(number)) System.out.println(number+" is a Harshad Number");
        else System.out.println(number+" is not a Harshad number");
        int[][] freq= digitFrequency(digits);
        for(int i=0;i<10;i++){
            if(freq[i][1]>0) System.out.println("Digit: "+freq[i][0]+" Frequency: "+freq[i][1]);
        }
        sc.close();
    }
    
}