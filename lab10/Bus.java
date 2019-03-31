public abstract class Bus {
    private int ID;
    private int capacity;
    private double cost;
    private static int nextID = 1;

    public Bus(int capacity, double cost) {
        ID = nextID++;
        this.capacity = capacity;
        this.cost = cost;
    }

    public abstract double getAccel();

    public final int getID() {
        return ID;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getCost() {
        return cost;
    }
}

interface LiquidFuel {
    public double getRange();

    public int getEmmisionTier();
}

interface Electric {
    public double LOW_VOLTAGE = 480;
    public double HIGH_VOLTAGE = 600;

    public double getVoltage();
}

class CNGBus extends Bus implements LiquidFuel {
    private double range;
    private int getEmmisionTier;

    public CNGBus(int capacity, double cost, double range, int getEmmisionTier) {
        super(capacity, cost);
        this.range = range;
        this.getEmmisionTier = getEmmisionTier;
    }

    public double getRange() {
        return this.range;
    }

    public int getEmmisionTier() {
        return this.getEmmisionTier;
    }

    public double getAccel() {
        return 3.0;
    }

}

class Hybrid extends Bus implements LiquidFuel, Electric {
    private double range;
    private int getEmmisionTier;
    private double voltage;

    public Hybrid(int capacity, double cost, double voltage, double range, int getEmmisionTier) {
        super(capacity, cost);
        this.range = range;
        this.getEmmisionTier = getEmmisionTier;
        this.voltage = voltage;
        if (voltage < LOW_VOLTAGE) {
            this.voltage = LOW_VOLTAGE;
        } else if (voltage > HIGH_VOLTAGE) {
            this.voltage = HIGH_VOLTAGE;
        }
    }

    public double getRange() {
        return this.range;
    }

    public int getEmmisionTier() {
        return this.getEmmisionTier;
    }

    public double getAccel() {
        return 4.0;
    }

    public double getVoltage() {
        return this.voltage;
    }
}