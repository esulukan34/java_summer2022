package day_09_Ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        /*
        kullanicidan bir sayi isteyin
        sayi poztifse sayiyi yazdirin
        sayi negatifse, bir sayi daha isteyin ve ikisinin carpimini yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        double sayi= scan.nextDouble();

        if(sayi>0){
            System.out.println(sayi);
        } else {
            System.out.println("Lütfen bir sayi daha giriniz");
            double sayi2= scan.nextDouble();
            System.out.println(sayi*sayi2);

        }
        /*
        eger if else icerisinde yeni kodlar varsa
        ternary ile yapmamız mumkun olmaz
         */
    }
}
