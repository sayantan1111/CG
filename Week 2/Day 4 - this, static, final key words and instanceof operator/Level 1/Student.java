public class Student {

    public static String universityName = "XYZ University";
    private static int totalStudents = 0;
    private final String rollNumber;
    private String name;
    private String grade;

    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total number of students enrolled: " + totalStudents);
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public void updateGrade(String newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated for student with Roll Number: " + this.rollNumber + " to " + this.grade);
    }

    public void displayStudentDetails() {
        System.out.println("University Name: " + universityName);
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Grade: " + this.grade);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", "S1001", "A");
        Student student2 = new Student("Bob", "S1002", "B");

        System.out.println("University Name (from student1): " + student1.universityName);
        System.out.println("University Name (from student2): " + student2.universityName);
        Student.displayTotalStudents();

        System.out.println("\nStudent 1 Details:");
        if (student1 instanceof Student) {
            student1.displayStudentDetails();
        }

        System.out.println("\nStudent 2 Details:");
        if (student2 instanceof Student) {
            student2.displayStudentDetails();
        }

        Student.universityName = "New Global University";
        System.out.println("\nUniversity Name after change (from student1): " + student1.universityName);
        System.out.println("University Name after change (from student2): " + student2.universityName);
        Student.displayTotalStudents();

        if (student1 instanceof Student) {
            student1.updateGrade("A+");
            student1.displayStudentDetails();
        }
    }
}