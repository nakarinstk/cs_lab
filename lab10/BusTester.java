import java.util.ArrayList;

public class BusTester {

    public static void main(String[] args) {

        ArrayList<Bus> arr = new ArrayList<Bus>();

        arr.add(new Hybrid(45, 1200000, 600, 150, 1));
        arr.add(new CNGBus(50, 1000000, 200, 2));
        for (Bus car : arr) {
            System.out.println("ID: " + car.getID());
            System.out.println("Emmision Tier: " + ((LiquidFuel) car).getEmmisionTier());
            System.out.println("Accel: " + car.getAccel());
        }

    }
}