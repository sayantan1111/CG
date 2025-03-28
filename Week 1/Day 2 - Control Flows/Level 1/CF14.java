import java.util.*;
class CF14{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n>=0)
	System.out.println("The sum of "+n+" numbers is "+(n*(n+1))/2);
else
	System.out.println(n+" is not natural number");

s.close();
}}