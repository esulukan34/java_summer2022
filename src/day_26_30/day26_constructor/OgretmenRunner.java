package day_26_30.day26_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogretmen1 = new Ogretmen();
        System.out.println("ogretmen1 = " + ogretmen1);

        System.out.println(" ");
        Ogretmen ogretmen2 = new Ogretmen("Emre", "Akdogan", "1/1/2001", "Matematik", "Fizik");
        System.out.println("ogretmen2 = " + ogretmen2);

        System.out.println(" ");
        Ogretmen ogretmen3 = new Ogretmen("Cavidan", "Kabinkara", "1/1/2001");
        System.out.println("ogretmen3 = " + ogretmen3);
    }
}
