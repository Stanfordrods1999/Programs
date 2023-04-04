
import java.util.Scanner;

class NewBooking extends ExistingBooking {
    int a;
    public void mMenu() {

        Scanner sc = new Scanner(System.in);
        a = booking.getCustArrCount();

        System.out.println("RESTAURANT BOOKING APPLICATION: NEW BOOKING");
        System.out.println("******************************");
        System.out.println("ENTER NAME: ");
        String custName = sc.next();
        System.out.println("ENTER TIME: ");
        double time = sc.nextDouble();
        System.out.println("******************************");
        booking.custArr.add(new Booking(custName,time)) ;//;//add(a, new Booking(custName,time));
        //a++;
        booking.setCustArrCount(a);

        Main.mainMenu();
    }
}