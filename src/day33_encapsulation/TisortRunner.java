package day33_encapsulation;

public class TisortRunner {
    public static void main(String[] args) {

        Tisort srt1= new Tisort();

        srt1.setFiyat(450);
        System.out.println(srt1.getFiyat());

        srt1.setPahaliMi(true);
        srt1.isPahaliMi();

        srt1.setRenk("Kirmizi");
        System.out.println(srt1.getRenk());

        srt1.setYakatipi("Polo Yaka");
        System.out.println(srt1.getYakatipi());


    }
}
