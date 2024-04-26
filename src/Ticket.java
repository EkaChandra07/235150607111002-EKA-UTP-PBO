public class Ticket {
    public static void main(String[] args) {
            private Movie movie;
            private int studioNumber;
            private double price;
            private String seat;
        
            public Ticket(Movie movie, int studioNumber, String seat) {
                this.movie = movie;
                this.studioNumber = studioNumber;
                this.seat = seat;
            }

            public String getTicketInfo() {
                return ticketInfo;
            }
        
            public Movie getMovie() {
                return Movie;
            }

            public int getStudioNumber() {
                return studioNumber;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public double getPrice() {
                return price;
            }

            public String getSeat() {
                return seat;
            }

            public double getTicketprice(String type) {
                this.type = type;
            }
    }
}

