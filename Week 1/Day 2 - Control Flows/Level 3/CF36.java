import java.util.*; 
class CF36{
public static void main(String[] args) { 
Scanner input=new Scanner(System.in);
System.out.print("Enter the number"); 
int number=input.nextInt();
int count=0;
int num=number; while(num>0){
num=num/10; count++;
}
System.out.println(count);
}
}