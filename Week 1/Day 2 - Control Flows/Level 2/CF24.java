import java.util.*; 
class CF24{ public static void main(String[] args) { 
 Scanner input=new Scanner(System.in); 
System.out.print("Enter the number");
 int number=input.nextInt(); 
if(number>0){ 
for(int i=1;i<=number;i++){
 if(number%3==0 && number%5==0){
 System.out.println("FizzBuzz"); } 
else if(number%5==0){ System.out.println("Buzz"); }
else if(number%3==0 ){ System.out.println("Fizz"); } 
else{ System.out.println("It is not divisible by 3 and 5"); 
}
 }
 } 
else{ System.out.println("It is is invalid number"); 
}
 }
 } 
