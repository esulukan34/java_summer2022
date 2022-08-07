package TEKRARLAR.C61_70;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C65_Contains_Array {
    /*
        Soru 3- Kullanicidan aldiginiz bir ismin, verilen array'de olup olmadigini
        kontrol edip, bize true veya false sonucu donen bir method olusturun.
         */
    public static void main(String[] args) {
        String[] isim = {"Asel", "Reyyan", "Hello", "Emre", "Can", "Abdullah"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Aradiginiz ismi giriniz : ");
        String arananIsim = sc.nextLine();

        varMi(isim,arananIsim);
        boolean sonuc = varMi(isim,arananIsim);
        if(sonuc){
            System.out.println("Listede VAR!");
        }else{
            System.out.println("Listede YOK!");
        }

    }

    private static boolean varMi(String[] isim, String arananIsim) {

        for (int i = 0; i < isim.length; i++) {
            if(isim[i].equalsIgnoreCase(arananIsim)){
                return true;
            }
        }
        return false;
    }
}
