import java.util.*;

class M112{
public static double[] calculateTrigFunctions(double a) {
double rad = Math.toRadians(a);
double sin = Math.sin(rad);
double cos = Math.cos(rad);
double tan = Math.tan(rad);
        
return new double[]{sin, cos, tan};
}

public static void main(String[] args) {
Scanner s = new Scanner(System.in);

System.out.print("Enter angle in degrees: ");
double angle = s.nextDouble();

double[] results = calculateTrigFunctions(angle);

System.out.println("Sin: " + results[0]);
System.out.println("Cos: " + results[1]);
System.out.println("Tan: " + results[2]);

s.close();
}
}
