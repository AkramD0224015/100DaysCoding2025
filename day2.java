package akram;
public class day2 {
    public static void main(String[] args) {

        System.out.println("Menggunakan println()");
        System.out.println("otomatis pindah baris");

        System.out.print("Menggunakan print()");
        System.out.print(" -> Tidak pindah baris");
        System.out.println(); // agar turun baris

        String nama = "Akram";
        int umur = 20;

        System.out.printf("Nama: %s, Umur: %d", nama, umur);
    }
}
