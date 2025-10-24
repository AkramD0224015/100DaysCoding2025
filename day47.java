package akram;

import java.util.Scanner;
public class day47 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);
        System.out.print("Masukan angka (1-7) :");
        int angka = akr.nextInt();

        switch (angka) {
            case 1:
                System.out.println("hari senin");
                break;
            case 2:
                System.out.println("hari selasa");
                break;
            case 3:
                System.out.println("hari rabu");
                break;
            case 4:
                System.out.println("hari kamis");
                break;
            case 5:
                System.out.println("hari jumat");
                break;
            case 6:
                System.out.println("hari sabtu");
                break;
            case 7:
                System.out.println("hari minggu");
                break;
            default:
                System.out.println("angka tidak valid");
        }
    }
}
