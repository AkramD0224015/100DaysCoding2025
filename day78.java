public static void main(String[] args) {

        String teks = "   Saya Belajar Java Programming   ";

        System.out.println("Jumlah karakter: " + teks.length());

        String hasilTrim = teks.trim();
        System.out.println("Setelah trim: " + hasilTrim);

        System.out.println("Huruf besar: " + hasilTrim.toUpperCase());

        System.out.println("Huruf kecil: " + hasilTrim.toLowerCase());

        System.out.println("Substring (5-12): " + hasilTrim.substring(5, 12));

        System.out.println("Replace: " + hasilTrim.replace("Java", "Python"));

        System.out.println("Apakah mengandung kata 'Belajar'? " + hasilTrim.contains("Belajar"));

        System.out.println("Diawali 'Saya'? " + hasilTrim.startsWith("Saya"));

        System.out.println("Diakhiri 'Programming'? " + hasilTrim.endsWith("Programming"));

        System.out.println("Sama dengan 'Saya Belajar Java Programming'? " +
                hasilTrim.equals("Saya Belajar Java Programming"));

        System.out.println("Apakah kosong? " + hasilTrim.isEmpty());

        System.out.println("Karakter ke-5: " + hasilTrim.charAt(4));
    }
}
