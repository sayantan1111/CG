
import java.util.*; 
class CF212{
public static void main(String[] args) { 
Scanner input=new Scanner(System.in);
System.out.print("Enter the number and power"); 
int number=input.nextInt();
int power=input.nextInt(); 
int result=1;
if(number>0){
for(int i=1;i<=power;i++){ 
result*=number;
}
System.out.println(result);
}
}
}


