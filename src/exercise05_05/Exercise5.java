package exercise05_05;

public class Exercise5 {

    public static void main(String[] args) {
//        byte a =23;
//        byte b= 84;
//        byte c = a*b;

        int x = 2147483645;
        int y = 2147483642;

        long z = (long)x*y;//dogrusu
        long z2 = (long)(x*y);//hata
        long z3 = x*y; //hata


        System.out.println(z);
        System.out.println(z2);
        System.out.println(z3);
        System.out.println(Integer.MAX_VALUE);

    }
}
