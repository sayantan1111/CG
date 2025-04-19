import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    private String evaluationType;

    public CourseType(String evaluationType) {
        this.evaluationType = evaluationType;
    }

    public String getEvaluationType() {
        return evaluationType;
    }

    @Override
    public String toString() {
        return "Evaluation Type: " + evaluationType;
    }
}

class ExamCourse extends CourseType {
    private int numberOfExams;

    public ExamCourse(int numberOfExams) {
        super("Exam-Based");
        this.numberOfExams = numberOfExams;
    }

    public int getNumberOfExams() {
        return numberOfExams;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Exams: " + numberOfExams;
    }
}

class AssignmentCourse extends CourseType {
    private int numberOfAssignments;

    public AssignmentCourse(int numberOfAssignments) {
        super("Assignment-Based");
        this.numberOfAssignments = numberOfAssignments;
    }

    public int getNumberOfAssignments() {
        return numberOfAssignments;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Assignments: " + numberOfAssignments;
    }
}

class ResearchCourse extends CourseType {
    private String researchArea;

    public ResearchCourse(String researchArea) {
        super("Research-Based");
        this.researchArea = researchArea;
    }

    public String getResearchArea() {
        return researchArea;
    }

    @Override
    public String toString() {
        return super.toString() + ", Research Area: " + researchArea;
    }
}

class Course<T extends CourseType> {
    private String courseName;
    private String department;
    private T courseType;

    public Course(String courseName, String department, T courseType) {
        this.courseName = courseName;
        this.department = department;
        this.courseType = courseType;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDepartment() {
        return department;
    }

    public T getCourseType() {
        return courseType;
    }

    @Override
    public String toString() {
        return "Course: " + courseName + ", Department: " + department + ", " + courseType;
    }
}

class Department {
    private String departmentName;
    private List<Course<?>> courses;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.courses = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void addCourse(Course<?> course) {
        courses.add(course);
    }

    public List<Course<?>> getCourses() {
        return courses;
    }
}

public class G3 {
    public static void displayCourses(List<? extends Course<?>> courses) {
        for (Course<?> course : courses) {
            System.out.println(course);
        }
    }

    public static void main(String[] args) {
        Department computerScience = new Department("Computer Science");
        Department electricalEngineering = new Department("Electrical Engineering");

        ExamCourse examCourse = new ExamCourse(2);
        AssignmentCourse assignmentCourse = new AssignmentCourse(5);
        ResearchCourse researchCourse = new ResearchCourse("Artificial Intelligence");

        Course<ExamCourse> cs101 = new Course<>("Introduction to Programming", "Computer Science", examCourse);
        Course<AssignmentCourse> cs201 = new Course<>("Data Structures", "Computer Science", assignmentCourse);
        Course<ResearchCourse> cs301 = new Course<>("Advanced AI", "Computer Science", researchCourse);
        Course<ExamCourse> ee101 = new Course<>("Circuit Analysis", "Electrical Engineering", examCourse);

        computerScience.addCourse(cs101);
        computerScience.addCourse(cs201);
        computerScience.addCourse(cs301);
        electricalEngineering.addCourse(ee101);

        System.out.println("Courses in " + computerScience.getDepartmentName() + ":");
        displayCourses(computerScience.getCourses());

        System.out.println("\nCourses in " + electricalEngineering.getDepartmentName() + ":");
        displayCourses(electricalEngineering.getCourses());
    }
}
