package TEKRARLAR.C51_60;

import java.util.Scanner;

public class C54_WhileLoop {
    /*
    Kullanicidan baslangic ve bitis harflerini alin
    ve baslangic harfinden baslayip bitis harfine biten
    tum harfleri buyuk harf olarak ekrana yazdirin.
    Kullanicinin hata yapmadigini farz edin
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("baslangic harfini giriniz");
        char bas = scan.next().charAt(0);
        System.out.println("bitis harfini giriniz");
        char bitis = scan.next().charAt(0);


        char temp = bas;
        String buyult ;

        while(temp<=bitis){
            buyult = (temp +"").toUpperCase();
            System.out.print(buyult + " ");
            temp ++;
        }





    }
}
