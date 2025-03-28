import java.util.Scanner;
public class M32{
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
        if(isDuck(digits)) System.out.println(number+" is a Duck number");
        else System.out.println(number+" is not a duck number");
        if(isArmstrong(number)) System.out.println(number+" is an armstrong number");
        else System.out.println(number+" is not an armstrong number");
        int[] large2large=largeAndSecondLarge(digits);
        int[] small2small=smallAndSecondSmall(digits);
        System.out.println("largest: "+large2large[0]+" Second largest: "+large2large[1]);
        System.out.println("Smallest: "+small2small[0]+" Second smallest: "+small2small[1]);
        sc.close();
    }
    
}
