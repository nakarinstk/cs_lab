public class MeasurerFilterTester {
    public static void main(String[] args) {

        Measurer m = new BankAccountMeasurer();
        Filter f = new BankAccountFilter();
        DataSet data = new DataSet(m, f);

        data.add(new BankAccount(1));
        data.add(new BankAccount(100));
        data.add(new BankAccount(2000));
        data.add(new BankAccount(950));
        data.add(new BankAccount(5000));

        System.out.println("Average balance= " + data.getAverage());
        BankAccount b = (BankAccount) data.getMaximum();
        double balance = b.getBalance();
        System.out.println("Highest balance= " + balance);
    }
}

class BankAccountMeasurer implements Measurer {
    public double measure(Object anObject) {
        BankAccount ba = (BankAccount) anObject;
        return ba.getBalance();
    }
}

class BankAccountFilter implements Filter {
    public boolean accept(Object x) {
        BankAccount ba = (BankAccount) x;
        return ba.getBalance() > 1000;
    }
}
