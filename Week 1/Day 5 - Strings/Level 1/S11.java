import java.util.*;
class S11{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
String b=s.nextLine();
boolean c=false;
for(int i=0;i<a.length();i++){
for(int j=0;j<b.length();j++){
if(a.charAt(i)==b.charAt(j)){
c=true;
}
else{
c=false;}
}}
System.out.println("str1.equals(str2): "+ a.equals(b));
s.close();
}} 
