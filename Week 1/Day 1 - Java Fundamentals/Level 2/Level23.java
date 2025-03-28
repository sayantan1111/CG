import java.util.*;
class Level23{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("num1: ");
double a=s.nextDouble();
System.out.println("num2: ");
double b=s.nextDouble();
System.out.println("num3: ");
double c=s.nextDouble();
double x=a+b*c;
double y=a*b+c;
double z=c+a/b;
double m=a%b+c;
System.out.println(x+","+y+","+z+","+m);
s.close();
}}


