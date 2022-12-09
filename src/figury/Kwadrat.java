package figury;

public class Kwadrat extends Prostokat{
    public Kwadrat(double a) {
        super(a, a);
    }
    public double obliczPrzekatna(){
        return getA()*Math.sqrt(2);
    }
}
