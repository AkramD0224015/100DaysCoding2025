package akram;
import java.util.Scanner;

public class day40 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = akr.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        char op = akr.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        double angka2 = akr.nextDouble();
        double hasil = 0;
        boolean valid = true;

        if (op == '+') {
            hasil = angka1 + angka2;
        } else if (op == '-') {
            hasil = angka1 - angka2;
        } else if (op == '*') {
            hasil = angka1 * angka2;
        } else if (op == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
            } else {
                System.out.println("Error: Tidak bisa dibagi 0");
                valid = false;
            }
        } else {
            System.out.println("Operator tidak dikenal");
            valid = false;
        }
        if (valid) {
            System.out.println("Hasil :" + hasil);
        }
    }
}
