import java.util.*; 
class CF26{
public static void main(String[] args) { 
Scanner input=new Scanner(System.in);
int age1,height1,age2,height2,age3,height3;
System.out.print("Enter the Amar age and height in cm"); age1=input.nextInt();
height1=input.nextInt();
System.out.print("Enter the Akbar age and height in cm"); age2=input.nextInt();
height2=input.nextInt();
System.out.print("Enter the Anthony age and height in cm");
age3=input.nextInt();
height3=input.nextInt();
 if(age1<age2 && age1<age3){
System.out.println("Amar is youngest");
}
else if(age2<age1 && age2<age3){
System.out.println("Akbar is youngest");
}
else{
System.out.println("Anthony is youngest");
}
if(height1>height2 && height1>height3){
System.out.println("Amar is Tallest");
}
else if(height2>height1 && height2>height3){ System.out.println("Akbar is Tallest");
}
else{
System.out.println("Anthony is Tallest");
}
}
}