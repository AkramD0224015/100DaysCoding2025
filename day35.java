package akram;

import java.util.Scanner;

public class day35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi badan: ");
        int tinggi = input.nextInt();

        if (tinggi >= 165) {
            System.out.println("boleh naik wahana ");
        } else {
            System.out.println("belum boleh naik wahana");
        }
    }
}
