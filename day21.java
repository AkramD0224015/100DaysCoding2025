public class day21 {
    public static void main(String[] args) {
        int a= 15;
        int b = 10;

        System.out.println("sebelum di tukar," +
                "\n a bernilai : " +a+
                "\n b bernilai : "+b);

        int nilai_awal = a;
        a= b;
        b= nilai_awal;

        System.out.println("setelah di tukar"+
                "\n a menjadi b : "+a+
                "\n b menjadi a : "+b);

    }
}
