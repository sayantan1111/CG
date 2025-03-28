
import java.util.Scanner;
public class Program10{
    public static int[][] generateMarks(int n){
        int[][] marks= new int[n][3];
        for(int i=0;i<n;i++){
            marks[i][0]=10+ (int)(Math.random()*90);
            marks[i][1]=10+ (int)(Math.random()*90);
            marks[i][2]=10+ (int)(Math.random()*90);
        }
        return marks;
    }
    public static double[][] generateResults(int[][] marks){
        int n=marks.length;
        double[][] results=new double[n][3];
        for(int i=0;i<n;i++){
            int total=marks[i][0]+marks[i][1]+marks[i][2];
            double average=total/3.0;
            double percentage=(total/300.0)*100;
            results[i][0]=total;
            results[i][1]=Math.round(average);
            results[i][2]=Math.round(percentage);
        }
        return results;
    }
    public static String[][] generateGrade(double[][] results){
        String[][] grade=new String[results.length][2];
        for(int i=0;i<results.length;i++){
            grade[i][0]=String.format("Student%d",i);
            if(results[i][2]>=80.0) grade[i][1]="A";
            else if(results[i][2]>=70.0) grade[i][1]="B";
            else if(results[i][2]>=60.0) grade[i][1]="C";
            else if(results[i][2]>=50.0) grade[i][1]="D";
            else if(results[i][2]>=40.0) grade[i][1]="E";
            else grade[i][1]="R";
        }
        return grade;
    }
    public static void printResult(int[][] marks,double[][] results,String[][] grade){
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for(int i=0;i<marks.length;i++){
            System.out.println((i+1) + "\t" + marks[i][0] + "\t" + marks[i][1] +"\t\t"+ marks[i][2] + "\t" + results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "%"+"\t\t"+grade[i][1]);

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int students=sc.nextInt();
        int[][] marks=generateMarks(students);
        double[][] results=generateResults(marks);
        String[][] grade=generateGrade(results);
        printResult(marks, results, grade);
    }
   
}

