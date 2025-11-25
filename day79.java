package akram;

import java.util.Scanner;
public class day79 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== BUAT AKUN ===");
        System.out.print("Buat username: ");
        String username = input.nextLine();
        System.out.print("Buat password: ");
        String password = input.nextLine();
        System.out.println("\nAkun berhasil dibuat!");
        System.out.println("====================\n");
        System.out.println("=== LOGIN ===");

        boolean loginBerhasil = false;

        while (!loginBerhasil) {
            System.out.print("Masukkan username: ");
            String inputUser = input.nextLine();
            System.out.print("Masukkan password: ");
            String inputPass = input.nextLine();

            if (inputUser.equals(username) && inputPass.equals(password)) {
                System.out.println("\nLogin berhasil! Selamat datang " + username);
                loginBerhasil = true;
            } else {
                System.out.println("\nUsername atau password salah, coba lagi!\n");
            }
        }
    }
}
