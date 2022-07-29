package day34_inheritance;

public class ToyotaCorolla extends Toyota {

    public static void main(String[] args) {
        /*
        Child class'tan parent class'a erisimde
        access modifier kurallarini bypass edemeyiz
        ornegin parent calss'daki private class uyelerini child class'dan kullanamayiz
        parent class'daki default access modifier'i olan
        class uyelerini child class'dan kullanamayiz
         */
        ToyotaCorolla arb1 = new ToyotaCorolla();
        System.out.println(arb1.marka); // Toyota
        System.out.println(arb1.model); // Model belirtilmedi




    }
}
