import java.util.*; 
class M311{ 

public static int[][] salaryYearofService(int n){ 
int[][] employeeDetails=new int[n][2]; 
for(int i=0;i<n;i++){ 
employeeDetails[i][0]=(int)(Math.random()*100000); 
employeeDetails[i][1]=(int)(Math.random()*10); 
} 
return employeeDetails; 
} 
public static double[][] bonusNewSalary(int[][] employeeDetails){ 
double[][] NewSalary=new 
double[employeeDetails.length][3]; 
for(int i=0;i<employeeDetails.length;i++){ 
if(employeeDetails[i][1]>=5){ 
NewSalary[i][0]=employeeDetails[i][0]+(employeeDetails[i][0]*
 0.05); 
NewSalary[i][1]=employeeDetails[i][0]*NewSalary[i][0]; 
NewSalary[i][2]=NewSalary[i][1]+NewSalary[i][0]; 
} 
else{ 
NewSalary[i][0]=employeeDetails[i][0]+(employeeDetails[i][0]*0.02); 
NewSalary[i][1]=employeeDetails[i][0]*NewSalary[i][0]; 
NewSalary[i][2]=NewSalary[i][1]+NewSalary[i][0]; 

} 
return NewSalary; 

} 
public static void displaySalary(int[][] employeeDetails,double[][] NewSalary){ 
double totalBonus=0,totalOldSalary=0,totalNewSalary=0; 
for(int i=0;i<employeeDetails.length;i++){ 
totalBonus=totalBonus+NewSalary[i][0]; 
totalOldSalary+=employeeDetails[i][0]; 
totalNewSalary+=NewSalary[i][1]; 
} 
System.out.println("Total Bonus :"+totalBonus); 
System.out.println("Total Old salarry :"+totalOldSalary); 
System.out.println("Total New Salary :"+totalNewSalary); 


} 
public static void main(String[] args) { 
Scanner input=new Scanner(System.in); 
System.out.println("Enter the number of employess"); 
int n=input.nextInt(); 
int[][] employeeDetails=salaryYearofService(n); 
double[][] NewSalary=bonusNewSalary(employeeDetails); 
displaySalary(employeeDetails, NewSalary);
}
}