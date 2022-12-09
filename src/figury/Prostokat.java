package figury;

public class Prostokat {
    private double a, b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double obliczPole(Kwadrat kwadrat){
        return a*b;
    }

}
