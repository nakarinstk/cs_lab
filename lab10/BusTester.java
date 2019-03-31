import java.util.ArrayList;

public class BusTester {

    public static void main(String[] args) {

        ArrayList<Bus> arr = new ArrayList<Bus>();

        arr.add(new CNGBus(50, 1000000, 200, 2));
        arr.add(new Hybrid(45, 1200000, 600, 150, 1));
        for (int i = 0; i < arr.size(); i++) {
            LiquidFuel foo = (LiquidFuel) arr.get(i);
            System.out.println("ID: " + (i + 1));
            System.out.println("Emmision Tier: " + foo.getEmmisionTier());
            System.out.println("Accel: " + arr.get(i).getAccel());
        }

    }
}