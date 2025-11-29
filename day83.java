public class day83 {
    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50};

        int total = 0;
        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
        }
        System.out.println("Total jumlah elemen array = "+ total);
    }
}
