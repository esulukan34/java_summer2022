package day_31_35.day35_inheritancedeConstructorKullanimi;

public class BParent extends AGrandParent {
    protected String isim = "Parent isim belirtilmedi";
    protected String parentKlupAdi = "Parent Klubu";

    BParent(){
        System.out.println("Parent constructor calisti");
    }
}
