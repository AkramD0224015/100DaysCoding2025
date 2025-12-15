package akram;

import java.util.Scanner;
public class day99 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan N ");
        int n = input.nextInt();

        System.out.println("Bilangan prima dari 1 sampai "+ n + ":");

        for (int i = 2; i <= n; i++) {
            boolean prima = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) {
                System.out.print(i + " ");
            }
        }
    }
}
