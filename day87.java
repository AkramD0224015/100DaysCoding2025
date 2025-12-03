package akram;

import java.util.Scanner;
public class day87 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);
        int[] angka = { 65, 45, 99, 85, 21, 51 };

        System.out.print("Masukkan angka yang ingin dicari: ");
        int cari = akr.nextInt();

        int posisi = -1;

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                posisi = i;
            }
        }
        if (posisi != -1) {
            System.out.println(cari + " berada di indeks ke " + posisi);
        } else {
            System.out.println(cari + " tidak ditemukan di dalam array");
        }
    }
}
