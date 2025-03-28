import java.util.*;
class M17{
public static int natural(int n){
int sum=0;
for(int i=1;i<=n;i++){
sum+=i;}
return sum;}
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int r=natural(n);
System.out.println(r);
s.close();
}}