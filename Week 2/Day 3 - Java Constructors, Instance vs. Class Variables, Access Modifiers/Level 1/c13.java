public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String teamName;

    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department); 
        System.out.println("Salary: $" + getSalary()); 
        System.out.println("Team Name: " + teamName);
    }

    public void increaseSalary(double amount) {
        setSalary(getSalary() + amount);
        System.out.println("Salary increased by " + amount);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "Sales", 50000.0);
        employee1.displayEmployeeDetails();

        employee1.setSalary(55000.0);
        System.out.println("Updated Salary: " + employee1.getSalary());

        System.out.println();

        Manager manager1 = new Manager(201, "Marketing", 70000.0, "Marketing Team A");
        manager1.displayManagerDetails();

        System.out.println();

        manager1.increaseSalary(10000.0);
        manager1.displayManagerDetails();
    }
}