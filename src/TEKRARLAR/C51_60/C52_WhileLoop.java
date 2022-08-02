package TEKRARLAR.C51_60;

import java.util.Scanner;

public class C52_WhileLoop {
     /*
        kullanicidan toplanmak uzere sayılar alin
        sayilarin toplami 500 u gecince
        sayilarin toplamini ve kac sayi toplandigini su sekilde yazdirin

        13 sayi girdiniz ve toplamlari 567
         */
     public static void main(String[] args) {

          int sayi =0;
          int toplam =0;
          int sayac=0;
          Scanner scan = new Scanner(System.in);
          while(toplam<500){

               System.out.println("toplamak icin bir sayi giriniz");
               sayi = scan.nextInt();
               toplam += sayi;
               sayac++;
               if(sayac>4){
                    break;
               }
          }
          System.out.println(sayac + " sayi girdiniz ve toplamlari : " + toplam);





     }
}
