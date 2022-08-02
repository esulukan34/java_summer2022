package day_31_35.day33_encapsulation;

public class Araba {
    String marka = "Marka belirtilmedi"; // markanın access modifier'i default access modifier
    // oldugundan package icerisinde kullanilabilir
    private String model = "Marka belirtilmedi";
    // privite yaptigimiz model ve yakit variable'larina erisimi yetkilendirelim
    // modele deger atanabilsin ama gorulemesin (setter)
    // yakit ise gorulebilsin ama yeni deger atanamasin isteniyor (getter)
    //
    private String yakit = "Elektrikli";// tum arabalar elektirkli ise bu variable'in degistirilmemesi

    public void setModel(String model) {
        this.model = model;
    }


    public String getYakit() {
        return yakit;
    }


}
