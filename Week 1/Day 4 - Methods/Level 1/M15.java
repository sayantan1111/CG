import java.util.*;
class M15{
public static void print(int n){
if(n>0){
System.out.println("Positive");}
else if(n<0){
System.out.println("Negative");}
else{
System.out.println("Zero");}}
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
print(n);
s.close();
}}