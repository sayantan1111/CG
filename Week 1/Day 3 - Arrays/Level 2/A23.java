import java.util.Scanner;

class A23 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
       int[]a=new int[10];
	   for(int i=0;i<10;i++){
	   a[i]=s.nextInt();
}
	int l=Integer.MIN_VALUE,sl=Integer.MIN_VALUE;
	for(int i=0;i<10;i++){
	if(a[i]>l){
	l=a[i];
	
	}}
	for(int i=0;i<10;i++){
	if(a[i]>sl && a[i]!=l){
	sl=a[i];

}	}
System.out.println("Laregst:"+l);
	System.out.println("Second Largest:"+sl);

s.close();
}}
