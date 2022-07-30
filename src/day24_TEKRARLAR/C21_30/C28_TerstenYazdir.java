package day24_TEKRARLAR.C21_30;

import java.util.Scanner;

public class C28_TerstenYazdir {
    //input olarak verilen 4 harfli bir stringi
    //tersten yazdiran bir method olusturalim
    public static void main(String[] args) {

        String input = "Asel";

        terstenYaz(input);
        System.out.println(terstenYaz(input));

    }

    private static String terstenYaz(String input) {
        String tersInput = input.substring(3)
                + input.substring(2,3)
                + input.substring(1,2)
                + input.substring(0,1);

        return tersInput;
    }
}
