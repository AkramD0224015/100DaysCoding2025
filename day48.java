package akram;

import java.util.Scanner;
public class day48 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);
        System.out.println("Membuat kalkulator sederhana");
        System.out.print("Masukkan angka1 : ");
        int angka1 = akr.nextInt();

        System.out.print("Masukkan angka2 : ");
        int angka2 = akr.nextInt();

        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = akr.nextInt();

        int hasil;
        double hasil2;

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil Penjumlahan: " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil Pengurangan: " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil Perkalian: " + hasil);
                break;
            case 4:
                if (angka2 != 0) {
                    hasil2 = (double) angka1 / angka2;
                    System.out.println("Hasil Pembagian: " + hasil2);
                } else {
                    System.out.println("Error: Tidak bisa dibagi dengan nol");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
