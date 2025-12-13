package akram;

public class day97 {
    static int hitungLuas(int sisi) {
        return sisi * sisi;
    }
    public static void main(String[] args) {
        int sisi = 6;
        int luas = hitungLuas(sisi);

        System.out.println("Sisi persegi = " + sisi);
        System.out.println("Luas persegi = " + luas);
    }
}


