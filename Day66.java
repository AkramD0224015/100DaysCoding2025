package akram;

import java.util.Scanner;
public class day66 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);
        System.out.print("masukan bilangan :");
        int n = akr.nextInt();

        System.out.println("\n pola vertikal :");
        for (int i = 1; i <= n; i++) {
            System.out.println("**");
        }
    }
}
