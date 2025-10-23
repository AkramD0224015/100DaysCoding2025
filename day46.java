package Class;

import java.util.Scanner;

public class evaluasi4 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);
        System.out.print("masukan waktu pengerjan :");
        int mulai = akr.nextInt();
        System.out.print("waktu selesai pengerjaan :");
        int selesai = akr.nextInt();

        int waktutidur= (mulai + selesai)%24;
        int keluaran = 9 - waktutidur;

        System.out.println(keluaran);


    }
}
