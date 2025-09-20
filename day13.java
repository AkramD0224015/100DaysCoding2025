package akram;
import java.util.Scanner ;

public class day13 {
    public static void main(String[] args) {
    String nama = "lestari";
   final String nim ="D0224015";
    String study = "informatika" ;
    String alamat = "majene";
    float tb = 149f;
    double bb = 40.7;
    short usia = 21;
    long ukt = 5000000;
    char goldar = 'z' ;
    boolean aktif = false;
    byte sks = 20;
    int jarak = 13;
        System.out.println("masukkan nama             : " +nama);
        System.out.println("masukan nim               : " + nim);
        System.out.println("program study             : " + study);
        System.out.println("masukan alamat            : "+ alamat);
        System.out.println("masukan tinggi badan      : "+tb);
        System.out.println("masukan berat badan       : "+bb);
        System.out.println("berapa usia               : "+ usia);
        System.out.println("masukan golongan darah    : "+goldar);
        System.out.println("apakah kamu  aktif kuliah : "+aktif);
        System.out.println("berapa jumlah sks         : "+sks);
        System.out.println("berapa jarak tempuh       : "+jarak + " : km");

        System.out.println(" ");
        System.out.println("SESUDAH DI UPDATE MENGGUNAKAN INPUTAN ");
        Scanner input= new Scanner(System.in);
        System.out.print("Nama : ");
        nama = input.nextLine();


        System.out.print("Alamat : ");
         alamat = input.nextLine();


        System.out.print("Tinggi Badan : ");
        tb  = input.nextInt();

        System.out.print("jarak rumah ke kampus : ");
        jarak = input.nextInt();

        System.out.print("Berat Badan : ");
        goldar = input.next().charAt(0);

        System.out.println("setelah di update menggunakan inputan");

       // System.out.println("masukkan nama             : " +nama);
       // System.out.println("masukan nim               : " + nim);
      //  System.out.println("program study             : " + study);
      //  System.out.println("masukan alamat            : "+ alamat);
       // System.out.println("masukan tinggi badan      : "+tb);
      //  System.out.println("masukan berat badan       : "+bb);
      //  System.out.println("berapa usia               : "+ usia);
      //  System.out.println("masukan golongan darah    : "+goldar);
      //  System.out.println("apakah kamu  aktif kuliah : "+aktif);
      //  System.out.println("berapa jumlah sks         : "+sks);
       // System.out.println("berapa jarak tempuh       : "+jarak + " km");
        System.out.printf(
                "nama                   :  %s" +
                "%nnim                  : %s" +
                "%nprogram studi        :%s " +
                "%nalamat               :%s" +
                "%nberat badan          : %f"+
                "%ntinggi badan         : %f"+
                "%nnusia                : %d" +
                "%nukt                  : %d"+
                "%ngoldar               : %c"+
                "%nkeaktifan mahasiswa  :%b"+
                 "%njarak               :%d"+
                 "%njumlahsks           :%d",nama,nim,study,alamat,bb,tb,usia,ukt,goldar,aktif, jarak,sks);




    }
}
