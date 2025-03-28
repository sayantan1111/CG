import java.util.*;
class Level116{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("number : ");
int n=s.nextInt();
int max=(n * (n - 1)) / 2;

System.out.println("No.of possible handshakes: "+max);
}}