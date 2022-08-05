package TEKRARLAR.C51_60;

public class C60_DoWhileLoop {
    // For loop ve while loop kullanarak 3 basamakli sayilardan 15, 20 ve 90'a tam
    // tam bolunebilen sayilari yazdirin
    public static void main(String[] args) {


        int sayi = 100;
        int bitis = 1000;

        for (int i = sayi; i < bitis; i++) {
            if (i % 15 == 0 && i % 20 == 0 && i % 90 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println(" ");
        while (sayi < bitis) {
            if (sayi % 15 == 0 && sayi % 20 == 0 && sayi % 90 == 0) {
                System.out.print(sayi + " ");

            }sayi++;

        }
    }
}
