import java.util.*;
class M19{
public static int[] findRemainderAndQuotient(int n1, int n2){
int a=n1/n2;
int b=n1%n2;
return new int[]{a,b};
} 
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
int n2=s.nextInt();
int []r=findRemainderAndQuotient(n1,n2);
System.out.println("Remainder : "+r[1]);
System.out.println("Quotient : "+r[0]);
s.close();
}}
