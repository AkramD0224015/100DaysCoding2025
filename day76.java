import java.util.Scanner;

public class day76 {
    public static void main(String[] args) {
        Scanner akr = new Scanner(System.in);

        System.out.print("Masukkan kata pertama: ");
        String kata1 = akr.nextLine();

        System.out.print("Masukkan kata kedua: ");
        String kata2 = akr.nextLine();

        if (kata1.equals(kata2)) {
            System.out.println("Kedua kata SAMA ");
        } else {
            System.out.println("Kedua kata TIDAK sama ");
        }

        if (kata1.equalsIgnoreCase(kata2)) {
            System.out.println("Kedua kata sama walau beda huruf besar/kecil");
        }

        if (kata1.contains(kata2)) {
            System.out.println("Kata pertama MENGANDUNG kata kedua");
        }

        if (kata1.isEmpty()) {
            System.out.println("Kata pertama kosong");
        }
    }
}
