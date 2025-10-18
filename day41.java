package akram;
import java.util.Scanner;
public class day41 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);
        System.out.println("=== Menghitung Gaji Bersi ===");
        System.out.print("Masukkan Gaji Pokok: ");
        double gajiPokok = akr.nextDouble();
        System.out.print("Masukkan tunjangan Makan: ");
        double tunjanganmakan = akr.nextDouble();
        System.out.print("Masukkan Potongan Koperasi: ");
        double potonganKoperasi = akr.nextDouble();

        double gajiBersih = gajiPokok + tunjanganmakan - potonganKoperasi;

        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Gaji Pokok      : Rp"+gajiPokok);
        System.out.println("tunjangan Makan : Rp"+tunjanganmakan);
        System.out.println("Potongan Koperasi: Rp"+potonganKoperasi);
        System.out.println("Gaji Bersih     : Rp"+gajiBersih);
    }
}
