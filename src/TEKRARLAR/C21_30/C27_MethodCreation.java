package TEKRARLAR.C21_30;

public class C27_MethodCreation {
    // input olarak verilen iki integer'i toplayip sonucunu
    //yazdiran bir method olusturun
    public static void main(String[] args) {

        int sayi1=40;
        int sayi2=20;

        topla(sayi1,sayi2);
    }

    private static void topla(int sayi1, int sayi2) {

        int toplam =sayi1+sayi2;
        System.out.println("toplam = " + toplam);

    }
}
