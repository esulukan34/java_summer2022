package TEKRARLAR.C21_30;

public class C30_HarfGizleme {
    //Input olarak verilen isim ve soyismi
    //ilk harfi buyuk geriye kalan harfler * olacak sekilde
    // I***** K***** seklinde yazdiran bir method olusturun
    // kredi kartinin ilk dort rakamı yazilip sonrasi * olsun
    public static void main(String[] args) {

        String isim = "Ramazan";
        String soyisim = "Kizilkaya";
        String kart = "1234 5678 9876 5432";

        harfGizle(isim,soyisim,kart);

    }

    private static void harfGizle(String isim, String soyisim, String kart) {
        isim = isim.substring(0,1)+isim.substring(1).replaceAll("\\w","*");
        soyisim = soyisim.substring(0,1)+soyisim.substring(1).replaceAll("\\w","*");
        kart= kart.substring(0,4)+kart.substring(4).replaceAll("\\d","*");

        System.out.println(isim + " " + soyisim);
        System.out.println("kart = " + kart);

    }


}

