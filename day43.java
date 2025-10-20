package akram;

import java.util.Scanner;
public class day43 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);
        System.out.print("Masukkan nilai (0-100): ");
        int nilai = akr.nextInt();
        char predikat;

        if (nilai >= 85) {
            predikat = 'A';
        } else if (nilai >= 70) {
            predikat = 'B';
        } else if (nilai >= 55) {
            predikat = 'C';
        } else if (nilai >= 40) {
            predikat = 'D';
        } else {
            predikat = 'E';
        }
        System.out.println("Nilai    : "+ nilai);
        System.out.println("Predikat : "+ predikat);
    }
}
