package akram;

import java.util.Scanner;
public class day42 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int a = akr.nextInt();

        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println(a+ "adalah kelipatan 3 dan 5");
        } else if (a % 3 == 0) {
            System.out.println(a+ "adalah kelipatan 3");
        } else if (a % 5 == 0) {
            System.out.println(a+ "adalah kelipatan 5");
        } else {
            System.out.println(a+ "bukan kelipatan 3 maupun 5");
        }
    }
}
