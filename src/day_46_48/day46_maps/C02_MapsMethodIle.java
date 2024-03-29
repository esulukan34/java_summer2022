package day_46_48.day46_maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethodIle {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = ReusableMethods.mapOlustur();
        System.out.println(ogrenciMap);

        // value'lari sira numarali olarak yazdirin

        ReusableMethods.tumValueSiraliYazdir(ogrenciMap);

        // isim ve soyisimlerin oldugu birlikte olacagi bir liste olusturun
        List<String> sinifIsimSoyisimList = ReusableMethods.isimSoyisimListesiOlustur(ogrenciMap);
        System.out.println("isim soyisim listesi : " + sinifIsimSoyisimList);

        // kac farkli brans varsa brans ismi = branstakiOgrenciSayisi seklinde yazdirin

    }

}
