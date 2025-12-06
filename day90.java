package akram;

public class day90 {
    public static String cekGanjilGenap(int angka) {
        if (angka % 2 == 0) {
            return "Genap";
        } else {
            return "Ganjil";
        }
    }
    public static void main(String[] args) {
        System.out.println(cekGanjilGenap(7));
        System.out.println(cekGanjilGenap(10));
    }
}
