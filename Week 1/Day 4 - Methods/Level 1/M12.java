import java.util.*;
class M12{
public static int sN(int n){
return ((n * (n - 1)) / 2);
}
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of students: ");
int n=s.nextInt();
int a=sN(n);
System.out.println(a);
s.close();
}}
