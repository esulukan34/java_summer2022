package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayOlustur {
    //Soru 4- Kullanicidan bir array’in boyutunu ve tum elementlerini alarak
    // bir array olusturup, bu array’i bize donduren bir method olustur
    public static void main(String[] args) {
        /*
        int[] sayilar = arrayOlustur();
        System.out.println(Arrays.toString(sayilar));
    }

    public static int[] arrayOlustur() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac elemanli bir array olusturmami istersiniz ");
        int uzunluk = scan.nextInt();
        int[] olusturulan = new int[uzunluk];


        for (int i = 0; i < uzunluk; i++) {
            System.out.println(i + ". index icin sayi giriniz");
            olusturulan[i] = scan.nextInt();
        }
        return olusturulan;

         */

/*
        int[] sayilar1 = arrayYaz();
        System.out.println(Arrays.toString(sayilar1));
    }

    public static int[] arrayYaz() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac elemanli bir array olsun : ");
        int uzunluk = scan.nextInt();
        int[] arr = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.print("array'in " + i + " . index'ini girin : ");
            arr[i] = scan.nextInt();
        }

        return arr;

 */
        String[] kelimeler = arrayYap();
        System.out.println("Array = " + Arrays.toString(kelimeler));

    }

    public static String[] arrayYap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac elemanli bir array olsun : ");
        int uzunluk = scan.nextInt();

        String[] kelimeler = new String[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("array'in " + i + " . index'ini girin : ");
            kelimeler[i] = scan.nextLine();
        }
        return kelimeler;
    }

}
