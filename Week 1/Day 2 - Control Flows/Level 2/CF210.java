import java.util.*;
class CF210{
public static void main(String[] args) { 
Scanner input=new Scanner(System.in);
System.out.print("Enter the number "); 
int number=input.nextInt();
int GreatestFactor=1; 
int i =number-1;
while(i>1){
if(number%i==0){
GreatestFactor=i; 
break;
}
i--;
}
System.out.print(GreatestFactor);
}
}