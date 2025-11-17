package akram;
import java.util.Scanner;

public class day71 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);
        System.out.print("masukan nilai : ");
        int n  = akr.nextInt();

        System.out.println("\n pola siku siku terbalik :");
        for (int i = n; i >= 1  ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
    }
}
