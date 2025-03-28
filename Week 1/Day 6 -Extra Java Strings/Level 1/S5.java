import java.util.*;
class S5{
public static void main(String[]args){
	Scanner s=new Scanner(System.in);
	String a=s.nextLine();
	String[] words= a.split(" ");
	String longestword="";
	for(String word: words){
		if(word.length()>longestword.length()){
		longestword=word;
		}
	}
	System.out.println(longestword);
	s.close();
}
}