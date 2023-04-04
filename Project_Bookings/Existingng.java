import java.awt.print.Book;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class Existingng  {
    
        Booking booking=new Booking();
    void mainM() {
        Scanner sc = new Scanner(System.in);
        System.out.println("RESTAURANT BOOKING APPLICATION: EXISTING BOOKINGS");
        System.out.println("******************************");
        System.out.println("1.VIEW BOOKINGS");
        System.out.println("2.DELETE A BOOKING");
        System.out.println("******************************");
        System.out.println("Make a choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                viewBookings();
                break;

            case 2:
                System.out.println("DELETE");
                break;

            default:
                System.out.println("INVALUD INPUT!!");
                mainM();
        }

    }

    private void viewBookings() {

        System.out.println("NAME \t TIME");
        int size1=booking.custArr.size();

        System.out.println();
        for(int i=0;i<size1;i++) {
            System.out.print(booking.custArr.get(i).getCustName() + " \t " + booking.custArr.get(i).getTime());
            System.out.println();

        }
        }
    }