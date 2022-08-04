package TEKRARLAR.C51_60;

public class C54_WhileLoop {
    /*
    Kullanicidan baslangic ve bitis harflerini alin
    ve baslangic harfinden baslayip bitis harfine biten
    tum harfleri buyuk harf olarak ekrana yazdirin.
    Kullanicinin hata yapmadigini farz edin
     */

    public static void main(String[] args) {
        char ilkHarf ='k';
        char sonHarf = 't';

        char temp = ilkHarf;
        String buyult = "";

        while(temp<=sonHarf){
            buyult= (temp+"").toUpperCase();
            System.out.print(buyult + " ");
            temp++;
        }

    }
}
