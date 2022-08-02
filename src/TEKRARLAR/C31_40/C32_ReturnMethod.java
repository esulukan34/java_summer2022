package TEKRARLAR.C31_40;

public class C32_ReturnMethod {
    // iki cesit method vardir.geri dondurmeden ve geri donduren

    /*
    verilen iki sayiyi carpıp sonucu bize donduren(return) bir method yazalim
     */
    public static void main(String[] args) {
        int sayi1 = 14;
        int sayi2 = 26;

        carp(sayi1,sayi2);
        System.out.println("carpim = " + carp(sayi1, sayi2));
        carp2(sayi1,sayi2);

    }

    private static void carp2(int sayi1, int sayi2) {
        int carpim2 = sayi1*sayi2;
        System.out.println("carpim2 = " + carpim2);
    }

    private static int carp(int sayi1, int sayi2) {
        int carpim = sayi1*sayi2;
        return carpim;
    }
}
