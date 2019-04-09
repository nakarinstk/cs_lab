public class BankAccountMeasurer implements Measurer {
    public double measure(Object anObject) {
        BankAccount ba = (BankAccount) anObject;
        return ba.getBalance();
    }

}