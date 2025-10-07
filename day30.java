package akram;

public class day30 {
    public static void main(String[] args) {
        int a= 15;
        int b = 10;

        System.out.println("nilai a :"+a);
        System.out.println("nilai b :"+b);

        System.out.println("operator <=");
        System.out.println("a <= b  :" +(a<=b));//false
        System.out.println("b <= a  :" +(b<=a));//true
        System.out.println("a <= 15 :" +(a<=15));//true

        System.out.println("operator >=");
        System.out.println("a >= b  :" +(a>=b));//true
        System.out.println("b >= a  :" +(b>=a));//false
        System.out.println("b >= 10 :" +(b>=10));//true

    }
}
