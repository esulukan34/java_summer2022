package TEKRARLAR.C51_60;

import java.util.Scanner;

public class C55_WhileLoop {
    /*
        Kullanicidan bir sayi alin
        ve bu sayinin rakamlari toplamini yazin
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("toplamak icin bir sayi giriniz");
        int sayi = scan.nextInt();

        int birlerBas = 0;
        int toplam = 0;
        int temp = sayi;

        while(temp>0){

            birlerBas = temp%10;
            toplam += birlerBas;
            temp /= 10;
        }
        System.out.println(sayi + " sayisinin rakamlar toplami : " + toplam);
    }
}
