package akram;

public class day96 {
    public static double operator(double a, double b) {
        System.out.println("hasil dari " + a + " + " + b + " = " + (a + b));
        System.out.println("hasil dari " + a + " - " + b + " = " + (a - b));
        System.out.println("hasil dari " + a + " * " + b + " = " + (a * b));
        System.out.print("hasil dari " + a + " / " + b + " = ");
        return (a / b);
    }

    public static void main(String[] args) {
        double hasil = operator(15, 10);
        System.out.println(hasil);
    }
}
