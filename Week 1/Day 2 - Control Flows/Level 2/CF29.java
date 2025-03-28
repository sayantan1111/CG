import java.util.*;
class CF29{
public static void main(String[] args) { Scanner input=new Scanner(System.in);
System.out.print("Enter the number"); 
int number=input.nextInt();
int GreatestFactor=1;
for(int i=number-1;i>1;i--){ if(number%i==0){
GreatestFactor=i; 
break;
}
}
System.out.println(GreatestFactor);
}
}