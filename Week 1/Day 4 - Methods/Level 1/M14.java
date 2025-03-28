import java.util.*;
class M14{
public static double round(int a1,int a2,int a3){
int pe=a1+a2+a3;
double d=5*1000;
return (d/pe);}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a1=s.nextInt();
int a2=s.nextInt();
int a3=s.nextInt();
double r=round(a1,a2,a3);
System.out.println(r);
s.close();
}}