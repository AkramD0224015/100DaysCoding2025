package akram;

import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan panjang : ");
        int panjang = input.nextInt();

        System.out.print("masukan lebar   : ");
        int lebar = input.nextInt();

        int luas = panjang * lebar;
        System.out.println("luas persegi panjang adalah : "+luas);

        input.close();




    }
}
