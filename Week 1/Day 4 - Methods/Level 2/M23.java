import java.util.*;
class M23{
public static void ly(int n){
if((n%4==0 && n%100!=0)||(n%400==0)){
System.out.println("It is Leap year");
}
else{
System.out.println("It is not Leap year");

}}
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
ly(n);
s.close();
}}
