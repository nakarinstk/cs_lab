/**
 * CannonBallTester
 */
public class CannonBallTester {

    public static void main(String[] args) {
        CannonBall ball = new CannonBall(100);
        ball.simulatedFlight();
        System.out.println(ball.calculusFlight(ball.getSimulatedTime()));
    }
}