import java.util.*;
class M27{
public static boolean canStudentVote(int age){
if(age>=18){
return true;}
else{
return false;}}
public static void main(String[]args){
Scanner s= new Scanner(System.in);
int []age=new int[10];
for(int i=0;i<10;i++){
age[i]=s.nextInt();
System.out.println("At index"+i+","+ "is "+canStudentVote(age[i]));
}
s.close();
}}
