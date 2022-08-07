package TEKRARLAR.C61_70;

import java.util.Scanner;

public class C61_WhileLoop {
    /*  Kullanicidan baslangic ve bitis degeri alin
        baslangic ve bitis degeri dahil aradaki tum cift sayilari
        while loop kullanarak ekrana yazdirin
        */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("baslangivc sayisini giriniz");
        int bas = sc.nextInt();
        System.out.println("bitis sayisini giriniz");
        int bitis = sc.nextInt();


        while(bas<=bitis){
            if(bas%2==0){
                System.out.print(bas + " ");
            }bas++;
        }

    }
}
