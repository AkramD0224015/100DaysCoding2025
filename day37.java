package akram;

import java.util.Scanner;
public class day37 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);
        System.out.print("masukan bilangan: ");
        int angka = akr.nextInt();

        if ( angka==0){
            System.out.println("bilangan nol tidak ganjil maupun genap");
        }else if(angka%2==0){
            System.out.println("bilangan genap");
        }else{
            System.out.println("bilangan ganjil");
        }

    }
}
