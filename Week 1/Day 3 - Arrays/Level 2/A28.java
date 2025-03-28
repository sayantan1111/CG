import java.util.Scanner;

class A28 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter the number of students: ");
int n = s.nextInt();
int[][]marks = new int[n][3]; 
double[] percentage = new double[n]; 
String[] grades = new String[n]; 
for (int i = 0; i < n; i++) {
int sum = 0;
System.out.println("Enter marks for student " + (i + 1));
for (int j = 0; j < 3; j++) {
while (true) {
marks[i][j] = s.nextInt();
if (marks[i][j] >= 0 && marks[i][j] <= 100) {
break;
}
else {
System.out.println("Please enter a valid mark (0-100):");
}
}
sum += marks[i][j];
}
percentage[i] = sum / 3.0;
if (percentage[i] >= 80) {
grades[i] = "A";
}
else if (percentage[i] >= 70) {
grades[i] = "B";
}
else if (percentage[i] >= 60) {
grades[i] = "C";
}
else if (percentage[i] >= 50) {
grades[i] = "D";
} 
else if (percentage[i] >= 40) {
grades[i] = "E";
}
else {
grades[i] = "R";
}
}
System.out.println("Student | Physics | Chemistry | Maths | Percentage | Grade");
for (int i = 0; i < n; i++) {
System.out.printf("%d        | %d       | %d       | %d    | %.2f       | %s\n",(i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grades[i]);
}

s.close();
}
}
