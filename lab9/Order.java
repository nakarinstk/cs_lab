import java.util.ArrayList;

/**
 * Order
 */
public class Order {

    public static int cntOrder = 1;

    private int id;
    private Customer customer;
    private ArrayList<Pizza> pizzaList = new ArrayList<>();

    public Order(Customer customer) {
        this.customer = customer;
        this.id = cntOrder;
        cntOrder++;
    }

    public void addPizza(Pizza orderPizza) {
        this.pizzaList.add(orderPizza);
    }

    public String getOrderDetail() {
        String foo = "";
        System.out.println("Order id : " + this.id);
        System.out.print(this.customer.getName() + " tel : " + this.customer.getTel());
        if (this.customer.getDiscount() > 0.0) {
            System.out.println(" discount : " + this.customer.getDiscount());
        } else {
            System.out.println('\n');
        }
        for (Pizza var : pizzaList) {
            System.out.println(var.getName() + " price : " + var.getPrice());
        }
        System.out.println("Total piece : " + pizzaList.size());
        System.out.println("Total cost : " + calculatePayment());
        return foo;
    }

    public double calculatePayment() {
        double total = 0;
        for (Pizza var : pizzaList) {
            total += var.getPrice() * (1.0 - (customer.getDiscount() / 100.0));
        }
        return total;
    }
}