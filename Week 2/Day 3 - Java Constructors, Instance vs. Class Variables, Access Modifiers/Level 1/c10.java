public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0 && CGPA <= 10) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. CGPA must be between 0 and 10.");
        }
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPostgraduateDetails() {
        displayStudentDetails(); 
        System.out.println("Specialization: " + specialization);
    }

    public void modifyName(String newName) {
        this.name = newName; 
    }

    public static void main(String[] args) {
        Student student1 = new Student(101, "A", 8.5);
        student1.displayStudentDetails();

        student1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + student1.getCGPA());

        student1.setCGPA(12.0);

        System.out.println();

        PostgraduateStudent pgStudent1 = new PostgraduateStudent(201, "B", 9.2, "Computer Science");
        pgStudent1.displayPostgraduateDetails();

        pgStudent1.modifyName("C");
        System.out.println();
        pgStudent1.displayPostgraduateDetails();
    }
}