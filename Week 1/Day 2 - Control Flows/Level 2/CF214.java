import java.util.*; 
class CF214{
public static void main(String[] args) {
 Scanner input=new Scanner(System.in);
System.out.print("Enter the number and power"); 
int number=input.nextInt();
int power=input.nextInt(); 
int result=1;
while(power>0){
result*=number; power--;
}
System.out.println(result);
}
}
