import java.util.*;

class M111{
public static double calculateWindChill(double t, double w) {
return 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(w, 0.16);
}

public static void main(String[] args) {
Scanner s = new Scanner(System.in);

System.out.print("Enter temperature ");
double t = s.nextDouble();

System.out.print("Enter wind speed ");
double w = s.nextDouble();

if (t <= 50 && w >= 3) {
double wc = calculateWindChill(t, w);
System.out.println("Wind Chill Temperature: " + wc + "°F");
}
else {
System.out.println("Wind chill formula is valid only for temperatures ≤ 50°F and wind speed ≥ 3 mph.");
}

s.close();
}
}
