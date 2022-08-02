package day_36_40.day37_overriding;

public class C01_Overloading {
    public static void main(String[] args) {
        /*
        Bir class'da ayni isme ve ayni sigmature'a sahip iki method olmaz
        Aynı class'da ayni isimde birden fazla method olusturmak istersek
        mutlaka signature'i degistirmeliyiz

        Farkli calss'larda ayni isim ve signature'a sahip iki method olabilir
         */

    }

    void ekleme(){

    }

    void ekleme(int sayi){

    }

    void ekleme(String str){

    }

    void ekleme(String str,int sayi){

    }
    void ekleme(int sayi,String str){

    }

}
