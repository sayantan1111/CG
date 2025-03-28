import java.util.*;
class A22{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int [] age=new int[3];
int [] h=new int[3];
for(int i=0;i<3;i++){
age[i]=s.nextInt();
}
for(int j=0;j<3;j++){
h[j]=s.nextInt();
}
	Arrays.sort(age);
	Arrays.sort(h);
System.out.println("Student whose age is : "+age[0]+" is youngest");
System.out.println("Student whose height is : "+h[2]+" is tallest");

s.close();
}}