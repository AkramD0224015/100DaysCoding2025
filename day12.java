package akram;
import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);

        System.out.println("Input Biodata");
        System.out.print("Masukkan Nama      : ");
        String nama = akr.nextLine();

        System.out.print("Masukkan NIM       : ");
        String nim = akr.nextLine();

        System.out.print("Angkatan           : ");
        int angkatan = akr.nextInt();

        System.out.print("Masukkan Nilai IPK : ");
        float ipk = akr.nextFloat();

        System.out.print("Masukkan Nilai IPS : ");
        double ips = akr.nextDouble();

        System.out.println(
                "User bernama " + nama +
                        ", dengan NIM " + nim +
                        ". User adalah angkatan tahun " + angkatan +
                        " dengan nilai IPK (Indeks Prestasi Kumulatif) " + ipk +
                        " dan nilai IPS (Indeks Prestasi Semester) " + ips + "."
        );

        akr.close();
    }
}
