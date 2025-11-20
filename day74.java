public static void main(String[] args) {
//        String nama = "akram";
//        int a = 1;
//        byte b = 2;
//        short c = 3;
//        long d = 4;
//        float e = 6f;
//        double f = 2.0;
//        boolean g = true;
//        char h = 'r';
//
//        System.out.println("tampilkan"+a);
//        System.out.print("tampilkan "+b);
//        System.out.println();
//        System.out.printf("%d tampilkan c",c);
//        for (int i = 3; i <= 100 ; i+=3) {
//            if (i<50)
//           if ( i%2 ==0)
//            System.out.print(i+" ");

//            Scanner akr = new Scanner(System.in);
//            int pilihan = akr.nextInt();
//
//            switch (pilihan) {
//                case 1:
//                    System.out.println("pilih nasi campur ");
//                    break;
//                case 2:
//                    System.out.println("pilih nasi kuning ");
//                    break;
//                case 3:
//                    System.out.println(" pilih mie ayam  ");
//                    break;
//                case 4:
//                    System.out.println(" pilih mie instan ");
//                    break;
//                default:
//                    System.out.println(" pilihan tidak tersedia");
//        Scanner akr = new Scanner(System.in);
//        System.out.print("masukan nilai :");
//        int nilai = akr.nextInt();
//
//        String hasil = (nilai >= 70) ? "lulus" : "tidak lulus";
//        System.out.println("hasil = "+hasil);
        int a = 1;
        do {

            a++;
            if(a != 50){
                System.out.println(a);
                continue;

            }
            else if(a == 98){
                System.out.println(a);
                break;
            }

        }while (a < 101);
    }
}
