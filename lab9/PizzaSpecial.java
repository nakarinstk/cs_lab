/**
 * PizzaSpecial
 */
public class PizzaSpecial extends Pizza {

    private String special;

    public PizzaSpecial(String name, double price, String special) {
        super(name, price);
        this.special = special;
    }
}