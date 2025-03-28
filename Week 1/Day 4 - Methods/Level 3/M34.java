import java.util.Scanner;
public class M34{
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
    public static int[] reverseArray(int[] digits){
        int len=digits.length;
        int[] reverse = new int[len];
        for(int i=0;i<len;i++){
            reverse[i]=digits[len-1-i];
        }
        return reverse;
    }
    public static boolean compareArray(int[] arr1,int[] arr2){
        if(arr1.length!=arr2.length) return false;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
    public static boolean isPalindrome(int[] digits){
        int[] reversed= reverseArray(digits);
        return compareArray(digits, reversed);
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
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0) return true;
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
    public static boolean isPrime(int n){
        if(n==0 || n==1) return false;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static boolean isNeon(int n){
        int square = n*n;
        int sum=0;
        while(square>0){
            sum+=square%10;
            square/=10;
        }
        return (sum==n);
    }
    public static boolean isSpy(int[] digits){
        int sum=sumArray(digits);
        int product=1;
        for(int n:digits){
            product*=n;
        }
        return sum==product;
    }
    public static boolean isAutomorphic(int n){
        int square=n*n;
        return square%(int)Math.pow(10, Integer.toString(n).length()) ==n;
    }
    public static boolean isBuzz(int n){
        if(n%7==0 || n%10==7) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int[] digits=storeArray(number);
        System.out.print("Digits Array: ");
        if(isPrime(number)) System.out.println(number+" is a Prime Number");
        else System.out.println(number+" is not a Prime number");
        if(isNeon(number)) System.out.println(number+" is a Neon Number");
        else System.out.println(number+" is not a Neon number");
        if(isSpy(digits)) System.out.println(number+" is a Spy Number");
        else System.out.println(number+" is not a Spy number");
        if(isAutomorphic(number)) System.out.println(number+" is an Automorphic Number");
        else System.out.println(number+" is not an Automorphic number");
        if(isBuzz(number)) System.out.println(number+" is a Buzz Number");
        else System.out.println(number+" is not a Buzz number");
        sc.close();
    }
    
}