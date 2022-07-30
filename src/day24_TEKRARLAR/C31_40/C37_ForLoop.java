package day24_TEKRARLAR.C31_40;

import java.util.Scanner;

public class C37_ForLoop {
    /*
        Soru4)
        Kullanicidan 100 den kucuk bir sayi isteyin
        1 den başlayarak 3 un kati olan sayilari girilen sayiya kadar yazdirin
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("100 den kucuk bir sayi girin");
        int sayi = scan.nextInt();
        for (int i = 1; i <= sayi; i++) {
            if(i%3==0){
                System.out.print(i + " ");
            }
        }

    }
}
