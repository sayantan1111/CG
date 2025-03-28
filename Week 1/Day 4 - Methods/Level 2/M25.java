import java.util.*;
class M25{
    
    public static double yardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }
    
    public static double feetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    
    public static double metersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    
    public static double inchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    
    public static double inchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
    
    public static void main(String[] args) {
        double km = 5;
        double miles = 3;
        double meters = 10;
        double feet = 30;
        double yards = 2;
        double inches = 12;
        
        
        System.out.println(yards + " yards = " + yardsToFeet(yards) + " feet");
        System.out.println(feet + " feet = " + feetToYards(feet) + " yards");
        System.out.println(meters + " meters = " + metersToInches(meters) + " inches");
        System.out.println(inches + " inches = " + inchesToMeters(inches) + " meters");
        System.out.println(inches + " inches = " + inchesToCm(inches) + " cm");
    }
}
