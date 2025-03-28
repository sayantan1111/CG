import java.util.*;
class Level21{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("num1: ");
int a=s.nextInt();
System.out.println("num2: ");
int b=s.nextInt();
int c=a/b;
int d=a%b;
System.out.println("Quotient "+c+" and Remainder is "+d);
s.close();
}}