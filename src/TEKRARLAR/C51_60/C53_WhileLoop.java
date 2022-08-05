package TEKRARLAR.C51_60;

import java.util.Scanner;

public class C53_WhileLoop {
    /*
        Soru 6) Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        ve basarili sifre girinceye kadar tekrar sifre girmesini isteyin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kontrol = 0;
        boolean dogruMu = false;
        while (!dogruMu) {
            System.out.println("sifre giriniz");
            String sifre = scan.nextLine();

            if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
                kontrol++;
            } else {
                System.out.println("Ilk harf buyuk harf olmali");
            }
            if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
                kontrol++;
            } else {
                System.out.println("Son harf kucuk harf olmali");
            }
            if (!sifre.contains(" ")) {
                kontrol++;
            } else {
                System.out.println("Sifre bosluk icermemeli");
            }
            if (sifre.length() >= 8) {
                kontrol++;
            } else {
                System.out.println("Sifre uzunlugu en az 8 karakter olmali");
            }
            if (kontrol == 4){
                dogruMu = true;
                System.out.println("Sifre basari ile tanimlandi");
            }else{
                kontrol = 0;
            }
        }



    }
}
