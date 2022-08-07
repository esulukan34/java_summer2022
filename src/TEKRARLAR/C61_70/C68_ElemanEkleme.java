package TEKRARLAR.C61_70;

import java.util.Arrays;

public class C68_ElemanEkleme {
    // C67 deki methodu kullanarak array'e eleman ekleyelim
    public static void main(String[] args) {

        String[] macKadrosu = {"Abdulbaki" , "Can"};
        macKadrosu = C67_ArrayeElementEkleme.elemanEkle(macKadrosu, "Sedat");
        System.out.println(Arrays.toString(macKadrosu));


        System.out.println(Arrays.toString(C67_ArrayeElementEkleme.elemanEkle(macKadrosu, "Avni")));

    }
}
