package day35_inheritancedeConstructorKullanimi;

public class GToyota {
    GToyota() {

        System.out.println("GToyota parametresiz constructor. ");
    }

    GToyota(String isim) {
        //super(isim); extends olmadigi icin super constructor call'u java kabul etmez'
        System.out.println("GToyota parametreli constructor. ");
    }
}
