class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "ABC";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Months: " + duration);
        System.out.println("Fee: " + fee);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
        System.out.println("Institute name updated to: " + instituteName);
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 6, 15000.0);
        Course course2 = new Course("Web Development", 4, 12000.0);

        course1.displayCourseDetails();
        System.out.println();

        course2.displayCourseDetails();
        System.out.println();

        Course.updateInstituteName("XYZ");
        System.out.println();

        course1.displayCourseDetails(); 
        System.out.println();

        course2.displayCourseDetails(); 
    }
}