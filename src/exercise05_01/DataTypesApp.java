package exercise05_01;

public class DataTypesApp {

    public static void main(String[] args){
        boolean aBoolean = false;
        char aCharecter ='d';
        byte aByte = 126;
        short aShortInteger =1568;
        int anInteger = 1256456;
        long aLongInteger=45631341L;
        float aDecimalNumber = 1256.32F ;
        double aBigDecimalNumber=12.365987451236;
        final double THE_VALUE_OF_PI = 3.14;
        //THE_VALUE_OF_PI = 3.15;// final olarak atandgi icin degistirenezsin

        System.out.println(aBoolean);
        System.out.println(aCharecter);
        System.out.println(aByte);
        System.out.println(aShortInteger);
        System.out.println(anInteger);
        System.out.println(aLongInteger);
        System.out.println(aDecimalNumber);
        System.out.println(aBigDecimalNumber);

        System.out.println("=================================");

        int anTInteger = 0342;//octale
        int anTInteger1 = 0x56_31;//hexadecimal
        int anTInteger2 = 0b0101_1100;//binaire

        System.out.println(anTInteger);
        System.out.println(anTInteger1);
        System.out.println(anTInteger2);


    }
}
