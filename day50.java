package akram;

import java.util.Scanner;
public class day50 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);
        System.out.println("program menentukan ganjil genap");
        System.out.print("Masukan angka :");
        int angka = akr.nextInt();

        String hasil = (angka % 2==1) ? "ganjil" : "genap";

        System.out.println("hasil :"+hasil);

    }
}
