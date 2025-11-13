package akram;

import java.util.Scanner;
public class day67 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);
        System.out.print("masukkan bilangan :");
        int n = akr.nextInt();

        System.out.println("\nPola horizontal:");
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}
