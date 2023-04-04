import java.util.ArrayList;

public class Booking {
    private static int custArrCount = 0;
    private String custName;
    private  double time;
    Booking()
    {

    }
    static ArrayList<Booking> custArr = new ArrayList<Booking>(10);

    String getCustName() {return custName;}
    double getTime() {return time;}
    int getCustArrCount() { return custArrCount;}
     void setCustArrCount(int custArrCount) { this.custArrCount = custArrCount;}

    Booking(String custName, double time) {
        this.custName = custName;
        this.time = time;
    }

}