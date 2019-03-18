
public class Truck extends Car {
    private double maxWeight, weight;

    public Truck(double gas, double effience, double maxWeight, double weight) {
        super(gas, effience);
        if (weight > maxWeight) {
            weight = maxWeight;
        }
        this.weight = weight;
        this.maxWeight = maxWeight;
    }

    @Override
    public void drive(double distance) {
        double addPercent = 0;
        if (this.weight >= 1 && 10 >= this.weight) {
            addPercent = 0.1;
        } else if (this.weight > 10 && 20 >= this.weight) {
            addPercent = 0.2;
        } else if (this.weight > 20) {
            addPercent = 0.3;
        }
        if (super.getGas() >= (distance / (super.getEfficiency())) * (1 + addPercent)) {
            super.setGas(super.getGas() - (distance / (super.getEfficiency())) * (1 + addPercent));
        } else {
            System.out.println("You cannot drive too far,please add gas");
        }
    }
}