package day24_TEKRARLAR.C21_30;

public class C29_ToplamMethodu {
    //Verilen 3 basamakli bir sayinin
    //rakamlari toplamini yazdiran bir method olusturalim
    public static void main(String[] args) {

        int sayi = 987;

        rakamlarToplami(sayi);
        System.out.println("rakamlarToplami = " + rakamlarToplami(sayi));

    }

    private static int rakamlarToplami(int sayi) {
        int toplam = 0;

        toplam += sayi % 10;
        sayi = sayi / 10;

        toplam += sayi % 10;
        sayi = sayi / 10;

        toplam += sayi % 10;
        sayi = sayi / 10;

       return toplam;

    }
}
