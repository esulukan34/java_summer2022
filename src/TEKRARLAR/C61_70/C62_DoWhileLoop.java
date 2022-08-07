package TEKRARLAR.C61_70;

import java.util.Scanner;

public class C62_DoWhileLoop {
    /*
        Kullanicidan toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin 0'a basmasini soyleyin
        Kullanici 0'a bastiginda toplam kac pozitif sayi girdigini,
        ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        int sayac = 0;

        do{
            System.out.println("toplamak uzere pozitif sayilar girin");
            sayi=scan.nextInt();
            if(sayi>0){
                toplam += sayi;
                sayac++;
            }else if(sayi<0){
                System.out.println("Negatif sayi girmeyiniz");
            }
        }while(sayi !=0);
        System.out.println("girilen sayilarin toplami : " + toplam);
        System.out.println("sayac = " + sayac);


    }
}
