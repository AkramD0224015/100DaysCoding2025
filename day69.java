package akram;

import java.util.Scanner;
public class day69 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);

        System.out.print("Masukkan lebar : ");
        int lebar = akr.nextInt();

        System.out.print("Masukkan panjang : ");
        int panjang = akr.nextInt();

        System.out.println("\nPola Persegi Panjang:");

        for (int i = 1; i <= lebar; i++) {
            for (int j = 1; j <= panjang; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
