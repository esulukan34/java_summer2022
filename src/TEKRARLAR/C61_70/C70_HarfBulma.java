package TEKRARLAR.C61_70;

import java.util.Scanner;

public class C70_HarfBulma {
    /*
        Soru 3- Kullanicidan aldiginiz bir harfin, verilen array'de olup olmadigini
        kontrol edip, bize true veya false sonucu donen bir method olusturun.
         */
    public static void main(String[] args) {

        char[] harfler = {'a' ,'e' ,'k', 'm', 'n'};
        Scanner scan = new Scanner(System.in);
        System.out.println("aradiginiz harfi giriniz");
        char girilenHarf = scan.next().charAt(0);

        boolean sonuc = harfVarMi(harfler,girilenHarf);
        if(sonuc){
            System.out.println("Listede VAR!");
        }else{
            System.out.println("Listede YOK!");
        }


    }

    private static boolean harfVarMi(char[] harfler, char girilenHarf) {


        for (int i = 0; i < harfler.length; i++) {
            if(harfler[i]==girilenHarf){
                return true;
            }
        }return false;
    }
}
