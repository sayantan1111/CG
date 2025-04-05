public class Employee {

    public static String companyName = "TechCorp";
    private static int totalEmployees = 0;
    private final String id;
    private String name;
    private String designation;

    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total number of employees: " + totalEmployees);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }

    public void displayEmployeeDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Designation: " + this.designation);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", "E1001", "Software Engineer");
        Employee employee2 = new Employee("Jane Smith", "E1002", "Project Manager");

        System.out.println("Company Name (from employee1): " + employee1.companyName);
        System.out.println("Company Name (from employee2): " + employee2.companyName);
        Employee.displayTotalEmployees();

        System.out.println("\nEmployee 1 Details:");
        if (employee1 instanceof Employee) {
            employee1.displayEmployeeDetails();
        }

        System.out.println("\nEmployee 2 Details:");
        if (employee2 instanceof Employee) {
            employee2.displayEmployeeDetails();
        }

        Employee.companyName = "GlobalTech";
        System.out.println("\nCompany Name after change (from employee1): " + employee1.companyName);
        System.out.println("Company Name after change (from employee2): " + employee2.companyName);
        Employee.displayTotalEmployees();
    }
}