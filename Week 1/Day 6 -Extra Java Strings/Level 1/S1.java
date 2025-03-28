import java.util.*;
class S1{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
int vow=0,con=0;
String ref="aeiouAEIOU";
for(int i=0;i<a.length();i++){
if((a.charAt(i)>='A' && a.charAt(i)<='Z')||(a.charAt(i)>='a' && a.charAt(i)<='z')){
if(ref.indexOf(a.charAt(i))!=-1){
vow++;
}
else{
con++;}
}


}
System.out.println("vowels "+vow);
System.out.println("consonants "+con);
s.close();
}}
