import java.util.*; 
 
class M310{ 
   public static boolean areCollinearBySlope(int x1, int y1, 
int x2, int y2, int x3, int y3) { 
       return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1); 
   } 
   
   public static boolean areCollinearByArea(int x1, int y1, 
int x2, int y2, int x3, int y3) { 
       double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + 
x3 * (y1 - y2)); 
       return area == 0; 
   } 
 
   public static void main(String[] args) { 
       Scanner input = new Scanner(System.in); 
       System.out.println("Enter coordinates for three points (x1 y1 x2 y2 x3 y3):"); 
       int x1 = input.nextInt(); 
       int y1 = input.nextInt(); 

int x2 = input.nextInt(); 
int y2 = input.nextInt(); 
int x3 = input.nextInt(); 
int y3 = input.nextInt(); 
boolean collinearBySlope = areCollinearBySlope(x1, y1, 
x2, y2, x3, y3); 
boolean collinearByArea = areCollinearByArea(x1, y1, 
x2, y2, x3, y3); 
if (collinearBySlope && collinearByArea) { 
System.out.println("The points are collinear."); 
} else { 
System.out.println("The points are not collinear."); 
} 
} 
}