package akram;

import java.util.Scanner;
public class day49 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);

        System.out.println("program menentukan lulus atau tidak");
        System.out.print("masukan nilai :");
        int nilai = akr.nextInt();

        String hasil = (nilai >= 70) ? "lulus" : "tidak lulus";

        System.out.println("hasil :"+hasil);

    }
}
