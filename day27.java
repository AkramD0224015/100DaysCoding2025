package akram;

import java.util.Scanner;
public class day27 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("a :");
            int a = input.nextInt();
            System.out.print("b :");
            int b = input.nextInt();
            System.out.println("Sebelum angka ditukar:");
            System.out.println("a : "+a);
            System.out.println("b : "+b);
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("Setelah angka ditukar:");
            System.out.println("a : "+a);
            System.out.println("b : "+b);
        }
    }

