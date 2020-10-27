public class MyThirdApp {

    public static void main(String[] args){

        char firstLetterOfTheAlphabet = 'a';
        char secondLetterOfTheAlphabet = (char) (firstLetterOfTheAlphabet + 1);

//        System.out.println(firstLetterOfTheAlphabet);//a
//        System.out.println(firstLetterOfTheAlphabet+1);//98
//        System.out.println(  (char)(firstLetterOfTheAlphabet+1)    );//b

        System.out.println(secondLetterOfTheAlphabet);

        int num1 = 5;
        int num2 = 2;
       // int div= num1/num2; //2
       // double div = num1/num2;//2.0
        double div = (double) num1/num2; //2.5

        System.out.println(div);
    }
}
