
import java.util.Scanner;

public class ZellerTest {
        public static void main(String[] args) {
                Scanner myObj = new Scanner(System.in);
                System.out.println("Enter year (e.g., 2012):");
                int year = myObj.nextInt();
                System.out.println("Enter month (1-12):");
                int month = myObj.nextInt();
                System.out.println("Enter day of the month (1-31):");
                int day = myObj.nextInt();
                Zeller test = new Zeller(year, month, day);
                System.out.println(test.getDayOfWeek());
                myObj.close();
        }

}
