import java.util.*;
class CF17{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
int month=s.nextInt();
int day=s.nextInt();
if((month == 3 && day >= 20 && day <= 31) ||  (month == 4 && day >= 1 && day <= 30)  ||(month == 5 && day >= 1 && day <= 31)  ||  (month == 6 && day >= 1 && day <= 20))
{System.out.println("Its a Spring Season");}
else{
	System.out.println("Not a Spring Season");
}
s.close();
}}



