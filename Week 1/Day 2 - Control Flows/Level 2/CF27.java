import java.util.*;
class CF27{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the number"); 
int number=input.nextInt();
for(int i=1;i<=number;i++){ 
    if(number%i==0){
System.out.println(i);
}
}
}
}