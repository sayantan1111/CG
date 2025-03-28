import java.util.*;
class A11{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []a=new int[10];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
for(int i=0;i<n;i++){
if(a[i]>=18){
    System.out.println("Student " + (i + 1) + " (Age: " + a[i] + ") is eligible to vote.");
}
else{
    System.out.println("Student " + (i + 1) + " (Age: " + a[i] + ") is NOT eligible to vote.");
}
}
s.close();
}}
