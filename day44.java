package akram;

import java.util.Scanner;
public class day44 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);
        System.out.println("=== DAFTAR MENU MINUMAN ===");
        System.out.println("1. Es Teh");
        System.out.println("2. Kopi");
        System.out.println("3. Jus Jeruk");
        System.out.println("4. Air Mineral");
        System.out.print("Pilih minuman (1-4): ");
        int pilihan = akr.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Es Teh - Rp5.000");
                break;
            case 2:
                System.out.println("Anda memilih Kopi - Rp8.000");
                break;
            case 3:
                System.out.println("Anda memilih Jus Jeruk - Rp10.000");
                break;
            case 4:
                System.out.println("Anda memilih Air Mineral - Rp3.000");
                break;
            default:
                System.out.println("Pilihan tidak tersedia!");
        }
    }
}
