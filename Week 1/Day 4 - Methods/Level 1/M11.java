import java.util.*;
class M11{
public static int sI(int p,int r,int t){
return ((p*r*t)/100);}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int p=s.nextInt();
int r=s.nextInt();
int t=s.nextInt();
int a=sI(p,r,t);
System.out.println(a);
s.close();
}}

