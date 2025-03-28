import java.util.*; 
class M39{ 
public static double euclideanDistance(int x1,int x2,int 
y1,int y2){ 
double 
distance=(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)); 
return Math.sqrt(distance); 
} 
 
public static double[] equation(int x1,int x2,int y1,int 
y2){ 
double m=(y2-y1)/(x2-x1); 
double b=y1-m*x1; 
return new double[]{m,b}; 
} 
public static void main(String[] args) { 
Scanner input=new Scanner(System.in); 
System.out.println("ENter x1,x2,y1,y2"); 
int x1=input.nextInt(); 
int x2=input.nextInt(); 
int y1=input.nextInt(); 
int y2=input.nextInt(); 
double distance=euclideanDistance(x1, x2, y1, y2); 
System.out.println(distance); 
try { 
double[] equation = equation(x1, y1, x2, y2); 
System.out.printf("Equation of the line: y = %.2fx + %.2f\n", equation[0], equation[1]); 
} catch (ArithmeticException e) { 
System.out.println(e.getMessage()); 
} 
} 
} 
