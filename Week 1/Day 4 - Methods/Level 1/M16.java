import java.util.*;
class M16{
    public static boolean isSpring(int m, int d) {
        return (m == 3 && d >= 20) || (m == 4) || (m == 5) || (m == 6 && d <= 20);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int d=s.nextInt();
        if (isSpring(m, d))
            System.out.println("It's a Spring Season");
        else
            System.out.println("Not a Spring Season");
			
		s.close();
    }
}
