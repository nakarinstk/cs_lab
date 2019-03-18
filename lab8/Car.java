/**
 * Car
 */
public class Car {

    private double gas, effience;

    public Car(double gas, double effience) {
        this.gas = gas;
        this.effience = effience;
    }

    public void drive(double distance) {
        if (this.gas >= (distance / this.effience)) {
            this.gas -= distance / this.effience;
        } else {
            System.out.println("You cannot drive too far,please add gas");
        }
    }

    public void setGas(double amount) {
        this.gas = amount;
    }

    public double getGas() {
        return this.gas;
    }

    public double getEfficiency() {
        return this.effience;
    }

    public void addGas(double amount) {
        this.gas += amount;
    }

}
