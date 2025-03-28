import java.util.*;
class Level18{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("dist. in km: ");
        int a=s.nextInt();
        double m=(a*1)/1.6;
        System.out.println("The total miles is "+m+" for the given "+a);
        s.close();
    }
}