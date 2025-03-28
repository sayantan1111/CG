import java.util.*;
class A12{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []a=new int[10];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
for(int i=0;i<n;i++){
if(a[i]>0){
System.out.println(a[i]+" is positive");
if(a[i]%2==0){
System.out.println(a[i]+" is even");}
else{
System.out.println(a[i]+" is odd");}

}
else if(a[i]<0){
System.out.println(a[i]+" is not positive");}
else if(a[i]==a[n-1]){
System.out.println(a[i]+" is equal to"+a[n-1]);}
else if(a[i]==0){
System.out.println(a[i]+" is zero");}
}
s.close();
}}