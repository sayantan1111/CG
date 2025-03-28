import java.util.*;
class S2{
public static void main(String[]args){
	Scanner s=new Scanner(System.in);
	String a=s.nextLine();
	String r=" ";
	char ch;
	for(int i=0;i<a.length();i++){
		ch=a.charAt(i);
		r=ch+r;
	}
System.out.println(r);
s.close();
}}