package day35_inheritancedeConstructorKullanimi;

public class AGrandParent {

    protected String isim = "Grandpa ismi belirtilmedi";
    /*
    her class'ta gozukmese bile bir constructor vardir
    Bu class'tan obje olusturmak istedigimizde
    default constructor devreye girecektir.

    Default constructor'i gozlemleyemeyecegimiz icin onun
    yerine kullanilabilecek parametresiz constructor oluaturalim
     */
    protected String grandpaKlupAdi = "Grandpa Klubu";
    AGrandParent(){
        System.out.println("Grandpa constructor calisti. ");
    }

}
