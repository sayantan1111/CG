import java.util.*;
class Level22{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("num1: ");
int a=s.nextInt();
System.out.println("num2: ");
int b=s.nextInt();
System.out.println("num3: ");
int c=s.nextInt();
int x=a+b*c;
int y=a*b+c;
int z=c+a/b;
int m=a%b+c;
System.out.println(x+","+y+","+z+","+m);
s.close();
}}


