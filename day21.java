public class day21 {
    public static void main(String[] args) {
        int a= 15;
        int b = 10;

        System.out.println("sebelum ditukar"+
               "\n a bernilai : "+a+
                "\n b bernilai : "+b);
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("setelah di tukar," +
                "\n a bernilai : "+a+
                "\n b bernilai : "+b );

    }
}
