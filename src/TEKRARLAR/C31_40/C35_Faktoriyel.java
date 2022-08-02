package TEKRARLAR.C31_40;

public class C35_Faktoriyel {
    /*
       input olarak verilen bir tamsayi için faktoriyel hesaplayip yazdiran
       bir method olusturun.
       Verilen sayi negatif veya 20'den buyuk olursa girilen sayinin
       faktoriyeli hesaplanamaz uyarisi yazdirin
        */
    public static void main(String[] args) {

        int sayi = 20;

        faktoriyel(sayi);

    }

    private static void faktoriyel(int sayi) {
        int faktoriyel = 1;

        if(sayi<0 || sayi>=20){
            System.out.println("girilen sayinin faktoriyeli hesaplanamaz");
        }else{
            for (int i = 1; i <=sayi ; i++) {
                faktoriyel *= i;
            }
            System.out.println("Girilen sayinin faktoriyeli : " + faktoriyel);
        }

    }


}
