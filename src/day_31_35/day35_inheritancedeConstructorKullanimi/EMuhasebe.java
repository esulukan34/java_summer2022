package day_31_35.day35_inheritancedeConstructorKullanimi;

public class EMuhasebe extends DPersonel {

    EMuhasebe() {

        System.out.println("Muhasebe parametresiz constructor. ");
    }

    EMuhasebe(String isim) {

        System.out.println("Muhasebe parametreli constructor. ");
    }
}
