import figury.Kwadrat;
import figury.Prostokat;

public class Main {
    public static void main(String[] args) {
        Prostokat prostokat = new Prostokat(2, 3);
        System.out.println(prostokat.getA());
        System.out.println(prostokat.getB());
        //System.out.println(prostokat.obliczPole());
        System.out.println("---------------------");

        Kwadrat kwadrat = new Kwadrat(2);
        System.out.println(kwadrat.getA());
        System.out.println(kwadrat.getB());
        //System.out.println(kwadrat.obliczPole());

        Prostokat kwadratKtoryJestProstokatem = new Kwadrat(4);

        System.out.println(kwadrat.obliczPrzekatna());
    }
}