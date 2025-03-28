import java.util.*;
class CF114{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n>=0){
  int factorial=1;
  int i=n;
  while(i>0){
  factorial*=i;
  i--;
  }
  System.out.println(factorial);
  }
  else{
    System.out.println("Not a positive integer");
	}
	s.close();
	}}
