package TEKRARLAR.C61_70;

public class C64_EnUzunEnKisaKelime {
    //Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun
    public static void main(String[] args) {

        String str[] = {"Asel", "Reyyan", "Ali", "Hello", "Emre", "Can", "Abdullah"};

        enUzunKelime(str);
        enKisaKelime(str);


    }

    private static void enKisaKelime(String[] str) {
        String kisa = str[0];
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() <= kisa.length()) {
                kisa = str[i];

            }
        }
        System.out.println("En kisa kelime : " + kisa);
    }

    private static void enUzunKelime(String[] str) {
        String uzun = str[0];
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > uzun.length()) {
                uzun = str[i];

            }
        }
        System.out.println("En uzun kelime : " + uzun);
    }
}
