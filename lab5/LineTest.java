import java.awt.geom.Point2D;

/**
 * LineTest
 */
public class LineTest {

    public static void main(String[] args) {
        // Test1
        // Line l1 = new Line(-2, 1, 1, -2);
        // Line l2 = new Line(-6, -2, -2, 0);

        // Test2
        // Line l1 = new Line(0, 2);
        // Line l2 = new Line(2, 1);

        // Test3
        // Line l1 = new Line(0.44, 3.4);
        // Line l2 = new Line(32, 32, 9);

        // Test4
        // Line l1 = new Line(3, 5);
        // Line l2 = new Line(5);

        // Test5
        // Line l1 = new Line(0, 4);
        // Line l2 = new Line(5);

        // Test6
        // Line l1 = new Line(0.44, 3.4);
        // Line l2 = new Line(0.44, 5);

        // Test7
        Line l1 = new Line(1, -24);
        Line l2 = new Line(29, 5, 53, 29);

        // Print Area
        System.out.println("Are the two lines equals?: " + l1.equals(l2));
        System.out.println("Are the two lines parallel?: " + l1.isParallel(l2));
        System.out.println("Do the two lines intersect?: " + l1.isIntersect(l2));
        Point2D.Double returnObj = l1.getIntersectionPoint(l2);
        if (Double.isFinite(returnObj.x) && Double.isFinite(returnObj.y)) {
            System.out.printf("Point of intersection: %.2f, %.2f", returnObj.x, returnObj.y);
        }
    }
}