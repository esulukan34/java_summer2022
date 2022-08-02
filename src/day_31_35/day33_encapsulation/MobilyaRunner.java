package day_31_35.day33_encapsulation;

public class MobilyaRunner {
    public static void main(String[] args) {
        Mobilya mbl1 = new Mobilya();

        mbl1.setMarka("Bellona");
        System.out.println("Mobilya Markasi = " + mbl1.getMarka());

        mbl1.setIsim("Koltuk Takimi");
        System.out.println("Mobilya ismi = " + mbl1.getIsim());

        mbl1.setMalzeme("Gurgen");
        System.out.println("Kullanilan Malzeme = " + mbl1.getMalzeme());

        mbl1.setFiyat(12500);
        System.out.println("Mobilya Fiyati = " + mbl1.getFiyat());


    }

}
