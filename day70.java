package akram;

import java.util.Scanner;
public class day70 {
    public static void main(String[] args) {
        
        Scanner akr = new Scanner(System.in);
        System.out.print("masukan nilai : ");
        int n  = akr.nextInt();

        System.out.println("\n pola siku siku :");
        for (int i = 1; i <= n  ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
    }
}

