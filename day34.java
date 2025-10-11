package akram;

import java.util.Scanner;
public class day34{
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = akr.nextInt();

        int a = 0; 
        int b = 0; 
        int c = 0; 
        int d = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) a += i;
            if (i % 2 == 0) b += i;
            if (i % 5 == 0 && i % 3 == 0) c += i;
            if (i % 5 == 0 || i % 3 == 0) d += i;
        }

        System.out.println("A (Total Ganjil)        = "+a);
        System.out.println("B (Total Genap)         ="+b);
        System.out.println("C (Habis dibagi 5 dan 3)="+c);
        System.out.println("D (Habis dibagi 5 atau 3)= "+d);

        int hasil1 = d *  b;
        int hasil2 = (a != 0) ? c / a : 0;
        int hasil3 = d + b;
        int hasil4 = b - a;
        int hasil5 = (d != 0) ? b % d : 0;

        System.out.println("\nPerhitungan Tambahan:");
        System.out.println("1. D x B = "+hasil1);
        System.out.println("2. C / A = "+hasil2);
        System.out.println("3. D + B = "+hasil3);
        System.out.println("4. C - A = "+hasil4);
        System.out.println("5. B % D = "+hasil5);

        System.out.print("\nHasil Perbandingan: ");
        if (3 < 5) {
            System.out.println("ara");
        } else if (3 > 5) {
            System.out.println("ara ara");
        } else {
            System.out.println("ara ara ara");
        }
    }
}

