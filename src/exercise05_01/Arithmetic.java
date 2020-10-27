package exercise05_01;
import java.sql.SQLOutput;
import java.util.*;

public class Arithmetic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       // int intValue  = scanner.nextInt();
        System.out.println("Please input an intiger");
        int number1 = scanner.nextInt();
        System.out.println("Please input a second intiger");
        int number2 = scanner.nextInt();

        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1*number2);
        System.out.println(number1/number2);
        System.out.println(number1%number2);

        System.out.println(--number2);
        System.out.println(number2--);
        System.out.println(number1++);
        System.out.println(++number1);
        char myCarecter = 'f';

        System.out.println((char)myCarecter + 1);

        scanner.close();

    }
}
