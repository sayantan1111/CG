import java.util.*; 
class CF310{
public static void main(String[] args) { 
Scanner input=new Scanner(System.in);
System.out.print("Enter first number"); 
double first=input.nextDouble();
System.out.print("Enter second number"); 
double second=input.nextDouble();
System.out.print("Enter the operation in +,-,/,*"); 
input.nextLine();
String op=input.nextLine(); switch (op) {
case "+":
System.out.println(first+second);
 break;
case "-":
System.out.println(second-first); 
break;
case "*":
System.out.println(first*second); 
break;
case "/":
System.out.println(second/first); 
break;
default:
System.out.println("Invalid Operator");
}
}
}

