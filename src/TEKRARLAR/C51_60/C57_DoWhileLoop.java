package TEKRARLAR.C51_60;

import java.util.Scanner;

public class C57_DoWhileLoop {
    /*
        Kullanicidan tam sayilar alin
        Kullanici cift sayi girdigi muddetce sayilari yazin
        Tek sayi girdiginde islemi bitirin
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         boolean dogruMu = true;
         int sayi;

         while(dogruMu){
             System.out.println("bir tamsayi giriniz");
             sayi = scan.nextInt();
             if(sayi%2==0){
                 System.out.print(sayi + "");
                 System.out.println(" ");
             }else{
                 System.out.println("sayi tektir GÜLE GÜLE :)");
                 dogruMu = false;
             }


         }


    }
}
