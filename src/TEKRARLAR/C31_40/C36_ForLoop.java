package TEKRARLAR.C31_40;

public class C36_ForLoop {
    //Soru3) 100 den 50 ye kadar olan sayilari aralarinda virgul kullanarak ayni satirda yazdirin
    public static void main(String[] args) {
        int sayi=0;

        for (int i = 100; i >50 ; i--) {
            sayi = i;
            System.out.print(sayi + ",");
        }

    }
}
