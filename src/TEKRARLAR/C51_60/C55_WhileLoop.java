package TEKRARLAR.C51_60;

import java.util.Scanner;

public class C55_WhileLoop {
    /*
        Kullanicidan bir sayi alin
        ve bu sayinin rakamlari toplamini yazin
         */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("pozitif bir sayi giriniz");
        int sayi = sc.nextInt();
        int rakamlarTop = 0;

        while(sayi>0){
            rakamlarTop += sayi%10;
            sayi /= 10;
        }
        System.out.println(rakamlarTop);
    }
}
