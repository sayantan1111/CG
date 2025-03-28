import java.util.*;
class Level19{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("Enter fee: ");
int fee=s.nextInt();
System.out.println("Enter discount: ");
int dPer=s.nextInt();

int discount=(fee*dPer)/100;
int dPrice=fee-discount;
System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+ dPrice);

}}