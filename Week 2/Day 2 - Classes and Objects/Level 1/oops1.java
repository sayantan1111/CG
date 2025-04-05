import java.util.*;
class Employee{
String name;
int id;
int salary;
Employee(String name,int id,int salary){
this.name=name;
this.id=id;
this.salary=salary;
}
void display(){System.out.println(name+" "+id+" "+salary);}
}
public class oops1{
public static void main(String[]args){
Employee e1=new Employee("Sayantan",100,30000);
e1.display();
}}