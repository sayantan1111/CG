import java.util.*;
 
class CF39{
public static void main(String[] args) { 
Scanner input=new Scanner(System.in);
System.out.print("Enter the number"); 
int num=input.nextInt();
int sum=0;
for(int i=1;i<num;i++){ 
if(num%i==0){
sum+=i;
}
}
if(sum>num){
System.out.println(num+" is an Abaundant number");
}
else{
System.out.println(num+" is not an Abaundant number");
}
}
}