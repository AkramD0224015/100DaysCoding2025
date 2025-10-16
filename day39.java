package akram;

import java.util.Scanner;
public class day39 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);

        System.out.println("=== DAFTAR MENU===");
        System.out.println("1. kopi panas ");
        System.out.println("2. teh panas ");
        System.out.println("3. coklat panas ");
        System.out.print("silahkan melakukan pesanan : ");
        int pilihan = akr.nextInt();

        System.out.println();

        if ( pilihan == 1){
            System.out.println("Anda memesan kopi panas ");
        } else if (pilihan == 2) {
            System.out.println("Anda memesan teh panas ");
        }else if (pilihan == 3) {
            System.out.println("Anda memesan coklat panas ");
        }else {
            System.out.println("tidak ada di menu ");
        }
        System.out.println("Terimakasih telah memesan ");
    }
}
