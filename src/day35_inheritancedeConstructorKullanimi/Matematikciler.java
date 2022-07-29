package day35_inheritancedeConstructorKullanimi;

import day35_inheritancedeConstructorKullanimi.LOgretmen;

public class Matematikciler extends LOgretmen {
    Matematikciler() {
        System.out.println("Matematik parametresiz cons");
    }

    Matematikciler(String isim) {
        this();
        System.out.println("Matematik parametreli cons");
    }

    public static void main(String[] args) {

        Matematikciler obj1 = new Matematikciler("Tugba");
    }
    /*
    this() constructor call, icinde bulunulan class'daki constructorlari,
    super() ise parent class'da bulunan constructor'lari cagirir

    this() veya super() parametre yapisina uygun bir constructor bulamazsa
    Java CTE verir.

    constructor konusunda gordugumuz this.
    o class'tadi instance  variable'lari refere ediyordu

    inheritance' da da super. vardir
    super. parent calss'daki instance variable'lari refere eder.
     */
}
