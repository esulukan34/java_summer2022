package TEKRARLAR.C51_60;

import java.util.Scanner;

public class C59_DoWhileLoop {
    /*
        Kullanicidan toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin 0'a basmasini soyleyin
        Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        ve "Negatif sayi giremezsiniz" yazdirip basa donun
        Kullanici 0'a bastiginda toplam kac pozitif sayi girdigini,
        yanlislikla kac negatif sayi girdigini
        ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi;
        int pozSayi = 0;
        int negSayi = 0;
        int toplam = 0;
        boolean sifirMi = true;

        while(sifirMi){
            System.out.println("toplamak uzere pozitif sayilar girin");
            sayi = scan.nextInt();
            if(sayi>0){
                toplam += sayi;
                pozSayi++;
            }else if(sayi<0){
                System.out.println("Negatif sayi giremezsiniz");
                negSayi++;
            }else{
                sifirMi=false;
            }
        }
        System.out.println("girilen sayilarin toplami : " + toplam);
        System.out.println("pozSayi = " + pozSayi);
        System.out.println("negSayi = " + negSayi);
    }
}
