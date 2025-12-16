package akram;

import java.util.*;
public class day100 {
    static int[] arrBaru;
    static int retas(int[] arr) {
        int n = arr.length;
        arrBaru = new int[n];
        Arrays.fill(arrBaru, -1);

        int p = 0;

        for(int i = 0; i < n; i++){
            int idx = arr[i] % n;

            if(idx < 0){
                idx = idx + n;
            }

            while(arrBaru[idx] != -1){
                idx++;
                p++;
                if(idx == n){
                    idx = 0;
                }
            }

            arrBaru[idx] = arr[i];
        }

        return p;
    }

    static String susunKode(int p){
        String s = "";

        for(int i = 0; i < arrBaru.length; i++){
            if(arrBaru[i] != -1){
                s = s + arrBaru[i];
            }
        }

        if(p > s.length()){
            p = s.length();
        }

        return s.substring(0, p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int p = retas(arr);
        String kode = susunKode(p);

        System.out.println(kode);
    }
}
