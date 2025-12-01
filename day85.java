
public class day85 {
    public static void main(String[] args) {
        int[] angka = { 65, 45, 99, 85, 21, 51};
        int max = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > max) {
                max = angka[i];
            }
        }
        System.out.println("Angka terbesar adalah: "+ max);
    }
}
