package day_16_20.day17_nestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
        /*
        kullanicidan toplanmak uzere sayılar alin
        sayilarin toplami 500 u gecince
        sayilarin toplamini ve kac sayi toplandigini su sekilde yazdirin

        13 sayi girdiniz ve toplamlari 567
         */

       int toplam=0;
       int sayi=0;
       int sayac=0;
       Scanner scan=new Scanner(System.in);

       while(toplam<500){
           System.out.println("Lutfen toplamak icin sayi girin:");
           sayi=scan.nextInt();
           toplam+=sayi;
           sayac++;
       }
        System.out.println(sayac + " sayi girdiniz ve toplamlari : " +toplam);

    }
}
