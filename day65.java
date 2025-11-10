package akram;

import java.util.Scanner;
public class day65 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = akr.nextInt();
        int hasil = 1;

        System.out.print("Proses: ");
        for (int i = n; i >= 1; i--) {
            hasil *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
        }
        System.out.println(" = " + hasil);
    }
}
