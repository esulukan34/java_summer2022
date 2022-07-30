package day24_TEKRARLAR.C31_40;

import java.util.Scanner;

public class C31_MethodCreation {
    /*
        Eger bir class'in icerisinde herhangi bir hesaplama yapip
        bunu da kalici halde saklamak istersek
        kodumuzu sade ve anlaşilir tutmak icin
        islemi bir method'a dondurebiliriz
        Return type'i void olmayan bir method'un sonucunu
        main method'da bir variable'a atama yaparsak
        programin geri kalaninda bu yeni degeri kullanma sansimiz olur
         */
    //kullanicidan sehir ismini ve dogum tarihini alin
    //bunlari programda kullanacagimiz formatta bize donduren bir method olusturun
    //sehir ismini programda buyuk harf olarak
    //tarihi ise 2022-06-30 seklinde kullanmak istiyoruz
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dogdugunuz sehri giriniz:");
        String sehir= scan.nextLine().toUpperCase();
        System.out.println("Dogum yilinizi giriniz");
        int yil = scan.nextInt();
        System.out.println("Dogdugunuz ayi giriniz");
        int ay = scan.nextInt();
        System.out.println("Dogdugunuz gunu giriniz");
        int gun = scan.nextInt();



    }



}
