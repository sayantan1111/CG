import java.util.*;
class level114{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("Enter distance in feet: ");
double df=s.nextDouble();
int dy=(int)df/3;
double dm=(dy/1760);
System.out.println("Your distance in feet is "+df+" while in yards is "+dy+" and miles is "+dm);
}}