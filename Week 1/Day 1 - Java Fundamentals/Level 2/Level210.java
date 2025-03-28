import java.util.*;
class Level210{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
int a=n/m;
int b=n%m;
System.out.println("The number of chocolates each child gets is "+a+" and the number of remaining chocolates are "+b);
s.close();
}}