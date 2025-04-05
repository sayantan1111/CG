class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 100.0; 

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Alice", "Car");
        Vehicle vehicle2 = new Vehicle("Bob", "Motorcycle");

        vehicle1.displayVehicleDetails();
        System.out.println();

        vehicle2.displayVehicleDetails();
        System.out.println();

        Vehicle.updateRegistrationFee(15000.0);
        System.out.println();

        vehicle1.displayVehicleDetails();
        System.out.println();

        vehicle2.displayVehicleDetails(); 
    }
}