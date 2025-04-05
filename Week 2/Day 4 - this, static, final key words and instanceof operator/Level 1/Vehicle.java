public class Vehicle {

    public static double registrationFee = 100.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void displayVehicleDetails() {
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("Owner Name: " + this.ownerName);
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Registration Number: " + this.registrationNumber);
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("John Smith", "Car", "TN01AB1234");
        Vehicle vehicle2 = new Vehicle("Alice Johnson", "Bike", "TN02CD5678");

        System.out.println("Current Registration Fee: " + Vehicle.registrationFee);

        System.out.println("\nVehicle 1 Details:");
        if (vehicle1 instanceof Vehicle) {
            vehicle1.displayVehicleDetails();
        }

        System.out.println("\nVehicle 2 Details:");
        if (vehicle2 instanceof Vehicle) {
            vehicle2.displayVehicleDetails();
        }

        Vehicle.updateRegistrationFee(150.0);
        System.out.println("\nUpdated Registration Fee: " + Vehicle.registrationFee);

        System.out.println("\nVehicle 1 Details after fee update:");
        if (vehicle1 instanceof Vehicle) {
            vehicle1.displayVehicleDetails();
        }

        System.out.println("\nVehicle 2 Details after fee update:");
        if (vehicle2 instanceof Vehicle) {
            vehicle2.displayVehicleDetails();
        }
    }
}