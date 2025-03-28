import java.util.*;
class S14{
public static void gE(){
String text=null;
text.length();
}
public static void hE(){
String text=null;
try{
text.length();
}
catch(NullPointerException e){
System.out.println("Caught exception: "+ e.getMessage());
}}


public static void main(String[]args){
try{
gE();
}catch(NullPointerException e){
System.out.println("Caught exception: "+ e.getMessage());
}
System.out.println("Demonstrating NPE ");
hE();
}}
