package TEKRARLAR.C41_50;

public class C49_NestedForLoop {
    /*
        verilen input'a gore
        *'lardan olusan asagıdaki sekli olusturun
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
         */
    public static void main(String[] args) {

        int input =4;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = input-1; i >0 ; i--) {
            for (int j = i; j >0 ; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
