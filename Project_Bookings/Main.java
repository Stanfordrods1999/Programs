import java.util.Scanner;

public class Main {

    static void mainMenu() {
        Scanner sc = new Scanner(System.in);
        NewBooking newBooking = new NewBooking();
        ExistingBooking existingBooking = new ExistingBooking();

        System.out.println("RESTAURANT BOOKING APPLICATION");
        System.out.println("******************************");
        System.out.println("1.MAKE NEW BOOKING");
        System.out.println("2.VIEW EXISTING BOOKINGS");
        System.out.println("******************************");
        System.out.println("Make a choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                newBooking.mMenu();
                break;

            case 2:
                existingBooking.mainM();
                break;


        }

    }

    public static void main(String[] args) {

        Main m = new Main();
        m.mainMenu();
    }
}







