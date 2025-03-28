import java.util.*;
class S3{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
a=a.toLowerCase();
String r="";
char ch;
for(int i=a.length()-1;i>=0;i--){
ch=a.charAt(i);
r=r+ch;
}
if(a.equals(r)){
System.out.println("Palindrome");
}
else{
System.out.println("Not Palindrome");
}
s.close();
}}