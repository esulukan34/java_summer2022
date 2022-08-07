package TEKRARLAR.C61_70;

import java.util.Arrays;
import java.util.Scanner;

public class C66_ArrayOlusturma {
    //Soru 4- Kullanicidan bir array’in boyutunu ve tum elementlerini alarak
    // bir array olusturup, bu array’i bize donduren bir method olustur
    public static void main(String[] args) {



        int[] arr = arrayYap();
        System.out.println(Arrays.toString(arr));

    }

    private static int[] arrayYap() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kac uzunlugunda bir array olsun?");
        int uzunluk = sc.nextInt();

        int [] arr = new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            System.out.println(i + " .indexi gir");
            arr[i] =sc.nextInt();
        }
        return arr;
    }
}
