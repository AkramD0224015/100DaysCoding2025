package akram;

import java.util.Scanner;
public class day63 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = akr.nextInt();
        int hasil = 1;

        for (int i = 1; i <= N; i++) {
            hasil *= i;
        }

        System.out.println("Hasil perkalian dari 1 sampai " + N + " adalah: " + hasil);
    }
}

