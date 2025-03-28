import java.util.*;
class CF112{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int sum=0;
if(n>=0){
 for(int i=0;i<=n;i++){
 sum+=i;
}}
else{
	 System.out.println("Not a natural number");
}
 System.out.println(sum);
 System.out.println((n*(n+1))/2);
 s.close();
 }}