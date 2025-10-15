package akram;

import java.util.Scanner;

public class day38 {
    public static void main(String[] args) {
        Scanner akr= new Scanner(System.in);
        System.out.print("masukan bilangan: ");
        int angka = akr.nextInt();

        if(angka>0){
            System.out.println("bilangan positif");
        } else if (angka<0) {
            System.out.println("bilangan negatif");
        }else{
            System.out.println("bilangan nol");
        }

    }

}

