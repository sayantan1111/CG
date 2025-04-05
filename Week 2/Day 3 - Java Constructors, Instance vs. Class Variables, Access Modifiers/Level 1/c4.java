class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    HotelBooking() {
        guestName = "Unknown";
        roomType = "1bhk";
        nights = 1;
    }
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Booking 1 Details:");
        booking1.displayBookingDetails();
        HotelBooking booking2 = new HotelBooking("SM", "3bhk", 3);
        System.out.println("Booking 2 Details:");
        booking2.displayBookingDetails();


        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("Booking 3 Details (copied from Booking 2):");
        booking3.displayBookingDetails();

        booking3.guestName = "Jane";
        booking3.nights = 5;

        System.out.println();
        System.out.println("Booking 3 Details after modification:");
        booking3.displayBookingDetails();
    }
}