public class User {
    private String email;
    private String password;
    private String fullName;
    private double balance;
    private Ticket[] ticketList;
    private int maxTicket;
    private int ticketCount;

    public User(String email, String password, String fullName, double balance, int maxTicket) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.balance = balance;
        this.maxTicket = maxTicket;
        this.ticketList = new Ticket[maxTicket];
        this.ticketCount = 0;
    }

    public boolean addTicket(Ticket ticket) {
        if (ticketCount < maxTicket) {
            ticketList[ticketCount++] = ticket;
            return true;
        }
        return false;
    }

    public void displayAllTicket() {
        System.out.println("Tiket untuk user: " + fullName);
        for (Ticket ticket : ticketList) {
            if (ticket != null) {
                System.out.println(ticket.toString());
            }
        }
    }

    public boolean isMatch(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

