package akram;

import java.util.Scanner;
public class day44 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);
        System.out.println("=== KANTIN DUA PUTRI ===");
        System.out.println("daftar menu");
        System.out.println("1. nasi campur");
        System.out.println("2. nasi kuning");
        System.out.println("3. mie ayam");
        System.out.println("4. mie intan");
        System.out.print("Pilih menu (1-4): ");
        int pilihan = akr.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("pilih nasi campur - Rp13.000");
                break;
            case 2:
                System.out.println("pilih nasi kuning - Rp12.000");
                break;
            case 3:
                System.out.println(" pilih mie ayam - Rp15.000");
                break;
            case 4:
                System.out.println(" pilih mie instan - Rp5.000");
                break;
            default:
                System.out.println(" pilihan tidak tersedia");
        }
    }
}
