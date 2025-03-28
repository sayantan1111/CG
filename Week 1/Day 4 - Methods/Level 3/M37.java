import java.util.*; 
class M37{ 
public static int[] OTPGenrator(int n){ 
int[] otp=new int[n]; 
for(int i=0;i<n;i++){ 
otp[i]=100000+(int)(Math.random()*1000000); 
} 
return otp; 
} 
public static boolean areOTPsUnique(int[] otpArray) { 
Set<Integer> otpSet = new HashSet<>(); 
for (int otp : otpArray) { 
if (!otpSet.add(otp)) { 
return false; 
} 
} 
return true; 

} 
public static void main(String[] args) { 
Scanner input=new Scanner(System.in); 
System.out.println("Enter how many OTP numbers you want to generate"); 
int n=input.nextInt(); 
int[] otpArray=OTPGenrator(n); 
for(int otp:otpArray){ 
System.out.println(otp); 
} 
boolean UniqueOTP=areOTPsUnique(otpArray); 
if(UniqueOTP){ 
System.out.println("All OTP'S are unique"); 
} 
else{ 
System.out.println("All OTP'S are not unique"); 
} 
} 
}