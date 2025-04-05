class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayRole() {
        System.out.println("This is a person.");
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println(name + " is a Teacher who teaches " + subject + ".");
    }
}

class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println(name + " is a Student in grade " + grade + ".");
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println(name + " is a Staff member in the " + department + " department.");
    }
}

public class I32 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Roy", 35, "Mathematics");
        Student student = new Student("Anita", 14, 9);
        Staff staff = new Staff("Ramesh", 40, "Administration");

        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}
