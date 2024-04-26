import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("Nama Sinema Anda", 3);

        cinema.init();

        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("UTP A Cinema");

        System.out.println("1.  Login:");
        System.out.println("1.  Register");
        System.out.println("1.  Exit");
        System.out.println("Pick your choice :");
        scanner.close();
    }
}
