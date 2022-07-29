package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayeElemanEkleme {
    public static void main(String[] args) {
        // C05 deki methodu kullanarak array'e eleman ekleyelim

        String[] takimListesi={"Suleyman", "Osman"};
        System.out.println(Arrays.toString(takimListesi));
        String eklenecekIsim="Talha";

        takimListesi= C05_ArrayeElemanEkleme.elemanEkle(takimListesi,eklenecekIsim);
        System.out.println(Arrays.toString(takimListesi));
    }
}
