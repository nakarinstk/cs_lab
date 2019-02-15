/**
 * CannonBall
 */
public class CannonBall {
    private double initSpeed;
    private double simulateDistance;
    private double simulateTime;
    private double simulateSpeed;
    public static final double GRAVITY = 9.81;
    public static final double DELTA_T = 0.01;

    public CannonBall(double usrInput) {
        this.initSpeed = usrInput;
        this.simulateSpeed = usrInput;
    }

    public void simulatedFlight() {
        int count = 0;
        while (simulateSpeed > 0) {
            simulateTime += DELTA_T;
            simulateSpeed -= (GRAVITY * DELTA_T);
            simulateDistance += simulateSpeed * DELTA_T;
            count += 1;
            if (count % 100 == 0) {
                System.out.printf("Distance on %d sec: %.2f\n", count / 100, simulateDistance);

            }
        }
        System.out.printf("Final distance %.3f Total time : %.2f\n", simulateDistance, simulateTime);
    }

    public double calculusFlight(double t) {
        System.out.print("Distance from calculus equation:");
        return (-0.5 * GRAVITY * (Math.pow(t, 2)) + (initSpeed * t));
    }

    public double getSimulatedTime() {
        return simulateTime;
    }

    public double getSimulatedDistance() {
        return simulateDistance;
    }
}