package akram;
import java.util.Scanner;
public class day73 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== KANTIN DUA PUTRI ===");
            System.out.println("Daftar Menu");
            System.out.println("1. Nasi Campur");
            System.out.println("2. Nasi Kuning");
            System.out.println("3. Mie Ayam");
            System.out.println("4. Mie Instan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = akr.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Nasi Campur");
                    break;
                case 2:
                    System.out.println("Nasi Kuning");
                    break;
                case 3:
                    System.out.println("Mie Ayam");
                    break;
                case 4:
                    System.out.println("Mie Instan ");
                    break;
                case 5:
                    System.out.println("program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 5);
    }
}
