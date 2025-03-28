import java.util.*;
class M23{
public static char[] cA(String str){
char[] ch=new char[str.length()];
for(int i=0;i<str.length();i++){
ch[i]=str.charAt(i);}
return ch;}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
char[] res=cA(a);
System.out.println(Arrays.toString(res));
System.out.println(Arrays.toString(a.toCharArray()));
s.close();
}};