package akram;

import java.util.Scanner;
public class day64 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);
        System.out.print("Masukkan nilai M : ");
        int M = akr.nextInt();
        System.out.print("Masukkan nilai N : ");
        int N = akr.nextInt();
        int hasil = 1;

        System.out.println("\nProses perhitungan:");
        for (int i = 1; i <= N; i++) {
            hasil *= M;
            System.out.println(" hasil = "+ hasil);
        }
        System.out.println("\n"+ M + " pangkat "+ N + " = "+ hasil);
    }
}
