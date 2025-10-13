package akram;

import java.util.Scanner;
public class day36 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);

        System.out.print("masukan umur :");
        int umur = akr.nextInt();

        System.out.print("masukan tinggi badan :");
        int tinggi = akr.nextInt();

        if (umur >= 15) {
            if (tinggi >= 160) {
                System.out.println("boleh naik wahana");
            } else {
                System.out.println("cukup umur, tapi tinggi belum cukup");
            }
        } else {
            System.out.println("belum cukup umur");
        }
    }
}






