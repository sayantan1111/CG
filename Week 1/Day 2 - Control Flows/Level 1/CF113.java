import java.util.*;
class CF113{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int sum=0;
if(n>=0){
	int i=0;
 while(i<=n){
 sum+=i;
 i++;
}}
else{
	 System.out.println("Not a natural number");
}
 System.out.println(sum);
 System.out.println((n*(n+1))/2);
 s.close();
 }}