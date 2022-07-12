package day19_Scope;

public class C03_ClassVariables {

    public static void main(String[] args) {
        /*
        Farkli bir class'ta calisirken herhangi bir class
        adini yazip noktaya basarsak static adini yazdigimiz
        tum static class uyelerini gorebilir ve kullanabiliriz
         */

        C02_StaticVariables.staticMethod(); // 10
        System.out.println(C02_StaticVariables.staticSayi); // 10
        System.out.println(C02_StaticVariables.degersizStaticVar); // 0
        /*
        Class level variable'lara deger atayip atamamak bize kalmistir.
        istersek deger atamasi yapariz istersek atamayiz. Eger deger
        atamissak Java atadigimiz o degeri kabul eder. deger atamazsak
        java bu variable'lara default bir değer ataması yapar
        int --> 0
        String --> null
        boolean --> false
        char --> '' (hiclik)
         */

        /*
        baska class'taki instance variable'lara obje olusturarak ulasabiliriz
         */

        C02_StaticVariables obje1= new C02_StaticVariables();
        obje1.staticOlmayanMethod(); // 10
        // bu method icinde staticSayi=20 oldu
        System.out.println(obje1.isim); // mehmet
        System.out.println(obje1.degersizInstanceVariable); // 0



        System.out.println(C02_StaticVariables.staticSayi); // 20
        /*
        Farkli bir class'tan C02 classindan method ve variable'lari kullandigimda
        C02 class'inin tamami degil sadce benim cagirdigim class uyeleri calisir

         */

    }
}
