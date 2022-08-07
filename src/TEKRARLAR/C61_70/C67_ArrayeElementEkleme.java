package TEKRARLAR.C61_70;

import java.util.Arrays;

public class C67_ArrayeElementEkleme {
    //Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun
    public static void main(String[] args) {
        String[] sinifListesi= {"Ali Can", "Nida Yucedal", "Musa Yaman"};
        String eklenek = "Ahmet";


        sinifListesi = elemanEkle(sinifListesi,eklenek);
        System.out.println(Arrays.toString(sinifListesi));

    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenek) {
        String[] yeniListe = new String[sinifListesi.length+1];
        for (int i = 0; i < sinifListesi.length; i++) {
            yeniListe[i]=sinifListesi[i];
        }
        yeniListe[yeniListe.length-1] = eklenek;

        return yeniListe;
    }
}
