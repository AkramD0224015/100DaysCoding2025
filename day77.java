package akram;

public class day77 {
    public static void main(String[] args) {

        String teks = "   Saya Belajar Java   ";

        String hasilTrim = teks.trim();
        System.out.println("Trim: " + hasilTrim);

        String hasilSub = hasilTrim.substring(5, 12);
        System.out.println("Substring: " + hasilSub);

        String hasilReplace = hasilTrim.replace("Java", "Programming");
        System.out.println("Replace: " + hasilReplace);
    }
}
