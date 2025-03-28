class Level17{
public static void main(String[]args){
int rk=6378;
double rm=(rk*1)/1.6;
double vk=(4*3.14*rk*rk*rk)/3;
double vm=(4*3.14*rm*rm*rm)/3;
System.out.println("The volume of earth in cubic kilometers is "+vk+" and cubic miles is "+vm); 
}}