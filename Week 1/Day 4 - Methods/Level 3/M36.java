import java.util.*; 
class M36{ 
   public static int[] factors(int number){ 
       int count=0; 
       for(int i=1;i<number;i++){ 
           if(number%i==0){ 
               count++; 
           } 
       } 
       int index=0; 
       int[] factors=new int[count]; 
       for(int i=1;i<number;i++){ 
           if(number%i==0){ 
               factors[index]=i; 
               index++; 
           } 
       } 
       return factors; 
   } 
   public static int GreatestFactor(int[] factors){ 
       int GreatestFactor=Integer.MIN_VALUE; 
       for(int i=0;i<factors.length;i++){ 

if(factors[i]>GreatestFactor){ 
GreatestFactor=factors[i]; 
} 
} 
return GreatestFactor; 
} 
public static int Sum(int[] factors){ 
int sum=0; 
for(int i=0;i<factors.length;i++){ 
sum+=factors[i]; 
} 
return sum; 
} 
public static int product(int[] factors){ 
int product=1; 
for(int i=0;i<factors.length;i++){ 
product*=factors[i]; 
} 
return product; 
} 
public static int cubeFactorProduct(int[] factors){ 
int product=1; 
for(int i=0;i<factors.length;i++){ 
product*=Math.pow(factors[i],3); 
} 
return product; 
} 
public static boolean isPerfect(int number,int[] factors){ 
int sum=0; 
for(int i=0;i<factors.length;i++){ 
sum+=factors[i]; 
} 
if(number>0 && number==sum){ 

return true; 
} 
return false; 
} 
public static boolean isAbundant(int number,int[] 
factors){ 
int sum=0; 
for(int i=0;i<factors.length;i++){ 
sum+=factors[i]; 
} 
if(sum>number){ 
return true; 
} 
return false; 
} 
public static boolean isDeficient(int number,int[] 
factors){ 
int sum=0; 
for(int i=0;i<factors.length;i++){ 
sum+=factors[i]; 
} 
if(sum<number){ 
return true; 
} 
return false; 
} 
public static boolean StrongNumber(int number){ 
int num=number; 
int sum=0; 
while(num>0){ 
int digit=num%10; 
int factorial=1; 
for(int i=1;i<=digit;i++){ 

factorial*=i; 
} 
sum+=factorial; 
num/=10; 
} 
if(sum==number){ 
return true; 
} 
return false; 
} 
public static void main(String[] args){ 
Scanner input=new Scanner(System.in); 
System.out.println("Enter the number"); 
int number=input.nextInt(); 
int[] factors=factors(number); 
for(int i=0;i<factors.length;i++){ 
System.out.print(factors[i]+" "); 
} 
int greatestFactor=GreatestFactor(factors); 
System.out.println("GreatestFactor is "+greatestFactor); 
int sum=Sum(factors); 
System.out.println("Sum of factors "+sum); 
int product=product(factors); 
System.out.println("Product of factors "+product); 
int productofcube=cubeFactorProduct(factors); 
System.out.println("product of cube of factors "+productofcube); 
boolean perfect=isPerfect(number, factors); 
System.out.println("isPerfect "+perfect); 
boolean abundant=isAbundant(number, factors); 
System.out.println("isAbundant "+abundant); 
boolean deficient=isDeficient(number, factors); 

System.out.println("isDeficient "+deficient); 
boolean strong=StrongNumber(number); 
System.out.println("isStrongNumber "+strong); 
} 
}