
/**
 * Taylor
 */
abstract class Taylor {
    private int k;
    private double x;

    public Taylor(int k, double x) {
        this.k = k;
        this.x = x;
    }

    public int factorial(int n) {
        int bar = 1;
        for (int i = 1; i < n + 1; i++) {
            bar = bar * i;
        }
        return bar;
    }

    public void selter(int k) {
        this.k = k;
    }

    public int getler() {
        return this.k;
    }

    public double getValue() {
        return this.x;
    }

    public abstract void printValue();

    public abstract double getApprox();

    public static void main(String[] args) {
        expo exp = new expo(7, 1);
        exp.printValue();
        sine s = new sine(7, Math.PI / 4);
        s.printValue();
        cosine cs = new cosine(7, 1);
        cs.printValue();
    }
}

class expo extends Taylor {
    public expo(int k, double x) {
        super(k, x);
    }

    public void printValue() {
        System.out.println("Value from Math.exp() : " + Math.exp(getValue()));
        System.out.println("Approximate value is : " + getApprox());
    }

    public double getApprox() {
        double foo = 0;
        for (int i = 0; i < getler(); i++) {
            foo += (Math.pow(getValue(), i)) / (factorial(i));
        }
        return foo;
    }
}

class sine extends Taylor {
    public sine(int k, double x) {
        super(k, x);
    }

    public void printValue() {
        System.out.println("Value from Math.sine() : " + Math.sin(getValue()));
        System.out.println("Approximate value is : " + getApprox());

    }

    public double getApprox() {
        double foo = 0;
        for (int i = 0; i < getler(); i++) {
            foo += (Math.pow(-1, i) * (Math.pow(getValue(), ((2 * i) + 1)))) / factorial((2 * i) + 1);
        }
        return foo;
    }
}

class cosine extends Taylor {
    public cosine(int k, double x) {
        super(k, x);
    }

    public void printValue() {
        System.out.println("Value from Math.cos() : " + Math.cos(getValue()));
        System.out.println("Approximate value is : " + getApprox());

    }

    public double getApprox() {
        double foo = 0;
        for (int i = 0; i < getler(); i++) {
            foo += (Math.pow(-1, i) * (Math.pow(getValue(), (2 * i)))) / factorial(2 * i);
        }
        return foo;
    }
}