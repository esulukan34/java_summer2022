package day_6_10.day07_ifStatements;

import java.util.Scanner;

public class C10_Work3 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir tamsayi isteyin ve bu tamsayının tek veya çift
        olduğunu yazdırın
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz:");

        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("Girilen sayı= Cifttir");
        } else{
            System.out.println("Girilen sayı= Tektir");
        }

    }
}
