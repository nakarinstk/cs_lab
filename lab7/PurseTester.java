/**
 * PurseTester
 */
public class PurseTester {

    public static void main(String[] args) {
        Purse test1 = new Purse("a");
        Purse test2 = new Purse("b");
        test1.addCoin("Quater");
        test1.addCoin("Dime");
        test1.addCoin("Nickel");
        test1.addCoin("Dime");
        // ----------
        test2.addCoin("Dime");
        test2.addCoin("Quater");
        test2.addCoin("Nickel");
        test2.addCoin("Dime");

        // Test Runner
        // System.out.println(test1);
        // ----------
        // System.out.println(test1.reverse());
        // // ----------
        // test1.tranfer(test2);
        // System.out.println(test1);
        // System.out.println(test2);
        // ----------
        System.out.println(test1.sameContent(test2));
        // ----------
        System.out.println(test1.sameCoins(test2));
    }

}