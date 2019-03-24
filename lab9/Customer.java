/**
 * Customer
 */
public class Customer {

    private String name, tel;

    public Customer(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return this.name;
    }

    public String getTel() {
        return this.tel;
    }

    public double getDiscount() {
        return 0.0;
    }
}