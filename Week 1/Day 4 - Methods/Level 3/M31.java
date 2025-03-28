import java.util.Arrays;
import java.util.Scanner;
public class M31 {
    public int[] generate3DigitRandomArray(int size){
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]= (int)(Math.random()*101)+150;
        }
        return arr;
    }
    public int sumOfArray(int[] arr){
        int sum=0;
        for(int n:arr){
            sum+=n;
        }
        return sum;
    }
    public int meanHeight(int[] arr){
        return sumOfArray(arr)/arr.length;
    }
    public int shortest(int[] arr){
        int min=arr[0];
        for(int n:arr){
            if(min>n) min=n;
        }
        return min;
    }
    public int tallest(int[] arr){
        int max=arr[0];
        for(int n:arr){
            if(max<n) max=n;
        }
        return max;
    }
    public static void main(String[] args) {
        int size=11;
        Program1 obj=new Program1();
        int[] arr= obj.generate3DigitRandomArray(size);
        int sum=obj.sumOfArray(arr);
        int shortest=obj.shortest(arr);
        int tall=obj.tallest(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum of Heights: "+sum);
        System.out.println("Shortest Height: "+shortest);
        System.out.println("Tallest Height: "+tall);
    }
}

