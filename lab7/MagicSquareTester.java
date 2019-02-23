import java.util.Scanner;

/**
 * MagicSquareTester
 */
public class MagicSquareTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please Enter Dimension Number :");
            if (sc.hasNextInt()) {
                dimSize = sc.nextInt();
                if (dimSize % 2 == 0) {
                    continue;
                }
                break;
            }
        }
        sc.close();
        MagicSquare test = new MagicSquare(dimSize);
        System.out.println(test);
    }
}