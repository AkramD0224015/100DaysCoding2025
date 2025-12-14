package akram;

import java.util.Scanner;
public class day98 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Masukkan N: ");
    int n = input.nextInt();

    int a = 0, b = 1;
        System.out.println("Deret Fibonacci:");
        for (int i = 1; i <= n; i++) {
        System.out.print(a + " ");
        int c = a + b;
        a = b;
        b = c;
    }
 }
}
