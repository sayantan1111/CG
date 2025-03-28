import java.util.*;
class S12{
public static String ss(String str,int a,int b){
	if(a<0||b>str.length()||a>b){
		return " ";
	}
StringBuilder c=new StringBuilder();
for(int i=a;i<=b;i++){
c.append(str.charAt(i));
}
return c.toString();}
public static void main(String[]args){

Scanner s=new Scanner(System.in);
String d=s.nextLine();
String sub=ss(d,4,10);
System.out.println(sub);
s.close();
}}