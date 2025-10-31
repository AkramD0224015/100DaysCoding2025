package akram;

public class day54 {
    public static void main(String[] args) {
        int a = 0;

        while (a < 5) {
            a++;
            if (a == 2) {
                continue;
            } else if (a == 4) {
                continue;
            }
            System.out.println("Nilai a = " + a);
        }
    }
}
