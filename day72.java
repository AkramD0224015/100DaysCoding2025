package akram;

import java.util.Scanner ;
public class day72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = 0;
        int angka = 0;

        System.out.println("masukan angka :");
        while (angka >= 0) {
            angka = input.nextInt();

            if (angka >= 0) {
                jumlah += angka;
            }
        }
        System.out.println("jumlah total :" + jumlah);
    }
}
