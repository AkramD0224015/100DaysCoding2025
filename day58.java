package akram;

import java.util.Scanner;
public class day58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        System.out.println("Angka 1 sampai N:");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Angka N sampai 1:");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }

        input.close();
    }
}
