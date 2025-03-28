import java.util.*;
class S4{
public static void main(String[]args){
	Scanner s=new Scanner(System.in);
	String a=s.nextLine();
	String ans="";
	for(int i=0;i<a.length();i++){
		int j;
		for(j=0;j<i;j++){
			if(a.charAt(i)==a.charAt(j)){
				break;
			}}
		if(i==j){
			ans+=a.charAt(i);
		}
	}
	System.out.println(ans);
	s.close();
}
}