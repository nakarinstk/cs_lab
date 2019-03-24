/**
 * GoldCustomer
 */
public class GoldCustomer extends Customer {

    private double discount;

    public GoldCustomer(String name, String tel, double discount) {
        super(name, tel);
        this.discount = discount;
    }

    public double getDiscount() {
        return this.discount;
    }

}