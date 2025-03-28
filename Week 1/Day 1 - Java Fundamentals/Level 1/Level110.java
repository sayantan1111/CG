import java.util.*;
class level110{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("Enter height in cm: ");
double hc=s.nextDouble();
double tInches=hc/2.54;
int feet=(int)(tInches/12);
int inches=(int)(tInches%12);
System.out.println("Your Height in cm is "+hc+" while in feet is "+feet+" and inches is "+inches);
}}