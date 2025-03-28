import java.util.*;
class Level112{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("Enter base: ");
double bcm=s.nextDouble();
System.out.println("Enter height: ");
double hcm=s.nextDouble();
int areaCm =(int) (0.5 * bcm * hcm);
int areaInch=(int)(areaCm/6.4516);
System.out.println("Your Height in cm is "+hcm+" while in feet is "+areaCm+" and inches is "+areaInch);
}}
