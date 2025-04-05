import java.util.*;
class Book{
String title;
String author;
int price;
Book(String title,String author,int price){
this.title=title;
this.author=author;
this.price=price;
}
void display(){System.out.println(title+" "+author+" "+price);}
}
public class oops3{
public static void main(String[]args){
Book e1=new Book("ABC","R Roy",3000);
e1.display();
}}