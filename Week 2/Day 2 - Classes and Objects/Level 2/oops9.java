class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = 0;
        this.price = 0.0;
    }

    void bookTicket(int seatNumber, double price) {
        if (this.seatNumber == 0) { 
            this.seatNumber = seatNumber;
            this.price = price;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Ticket already booked.");
        }
    }

    void displayTicketDetails() {
        if (seatNumber != 0) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        } else {
            System.out.println("Ticket not booked yet.");
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Avengers: Endgame");
        MovieTicket ticket2 = new MovieTicket("Oppenheimer");

        ticket1.bookTicket(15, 300);
        ticket1.displayTicketDetails();
        ticket2.displayTicketDetails();
        ticket2.bookTicket(22, 150);
        ticket2.displayTicketDetails();

        ticket1.bookTicket(16, 130); 
    }
}