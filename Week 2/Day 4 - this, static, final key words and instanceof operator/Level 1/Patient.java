public class Patient {

    public static String hospitalName = "City General Hospital";
    private static int totalPatients = 0;
    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total patients admitted: " + totalPatients);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAilment() {
        return ailment;
    }

    public String getPatientID() {
        return patientID;
    }

    public void displayPatientDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Ailment: " + this.ailment);
        System.out.println("Patient ID: " + this.patientID);
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("John Doe", 45, "Flu", "P1001");
        Patient patient2 = new Patient("Jane Smith", 30, "Fracture", "P1002");

        System.out.println("Hospital Name (from patient1): " + patient1.hospitalName);
        System.out.println("Hospital Name (from patient2): " + patient2.hospitalName);
        Patient.getTotalPatients();

        System.out.println("\nPatient 1 Details:");
        if (patient1 instanceof Patient) {
            patient1.displayPatientDetails();
        }

        System.out.println("\nPatient 2 Details:");
        if (patient2 instanceof Patient) {
            patient2.displayPatientDetails();
        }

        Patient.hospitalName = "County Medical Center";
        System.out.println("\nHospital Name after change (from patient1): " + patient1.hospitalName);
        System.out.println("Hospital Name after change (from patient2): " + patient2.hospitalName);
        Patient.getTotalPatients();
    }
}