class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double rentalRate;
    CarRental() {
        customerName = "Unknown";
        carModel = "Unknown";
        rentalDays = 0;
        rentalRate = 50.0; 
    }
    CarRental(String customerName, String carModel, int rentalDays, double rentalRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.rentalRate = rentalRate;
    }

    CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.rentalRate = other.rentalRate;
    }

    double calculateTotalCost() {
        return rentalDays * rentalRate;
    }

    void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Rental Rate: " + rentalRate + " per day");
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        rental1.displayRentalDetails();

        CarRental rental2 = new CarRental("Alice", "Xylo", 5, 750);
        rental2.displayRentalDetails();

        System.out.println();

        CarRental rental3 = new CarRental(rental2);
        rental3.displayRentalDetails();

        rental3.customerName = "Bob";
        rental3.rentalDays = 7;

        System.out.println();
        rental3.displayRentalDetails();

        System.out.println();
        rental2.displayRentalDetails(); 
    }
}