package TEKRARLAR.C41_50;

public class C48_ForLoop {
    /*
        verilen input'a göre yıldızlardan olusan bir ucgen olusturun
        ornek ınput=4 ise
        *
        * *
        * * *
        * * * *

     */
    public static void main(String[] args) {

        int input =4;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
