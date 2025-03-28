import java.util.*; 
class CF25{
public static void main(String[] args){
Scanner input=new Scanner(System.in); 
System.out.print("Enter the number "); 
int number=input.nextInt() ;
int i=number; 
if(number>0){
 
while(i>0){
if(number%3==0 && number%5==0){ System.out.println("FizzBuzz");
}
else if(number%5==0){
System.out.println("Buzz");
}else if(number%3==0 ){
System.out.println("Fizz");
}
else{
System.out.println("It is not divisible by 3 and 5");
}
i--;
}
}
}
}