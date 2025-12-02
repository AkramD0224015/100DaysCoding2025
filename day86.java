
public class day86 {
    public static void main(String[] args) {
        int[] angka = { 65, 45, 99, 85, 21, 51};
        int min = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
        }
        System.out.println("angka terkecil adalah: "+ min);
    }
}
