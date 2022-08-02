package TEKRARLAR.C41_50;

public class C47_ForLoop {
    // Verilen sayıya göre carpim tablosu olusturun
         /*
        input 3
        1 2 3
        2 4 6
        3 6 9
        */
    public static void main(String[] args) {
        int input = 4;
        int carpim = 1;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=input ; j++) {
                carpim = i*j;
                System.out.print(carpim + " ");
            }
            System.out.println("");

        }

    }
}
