package day_31_35.day35_inheritancedeConstructorKullanimi;

public class Child extends BParent {
    protected String isim = "Child isim belirtilmedi";
    protected String childKlupAdi = "Child Klubu";
    Child(){
        System.out.println("Child constructor calisti.");
    }

    public static void main(String[] args) {
        // AGrandParent gp1 = new AGrandParent();
        // bu objeyi olusturmak icin Grandpa Cons. calisir.
        // Parent veya child cons. calismaz

        Child child1 = new Child();
        child1.grandpaKlupAdi="Child";
        child1.parentKlupAdi= "Child2";
        // child1 objesi icin child cons. calisir
        /*
        Java'da bir class'i kullanabilmek icin
        o class'tan obje olusturur dolayisiyla o class'in
        constructor'ini kullanirdik

        Java inheritance 'da parent class'lardaki
        ozelliklerri kullanabilmek icin o clss'larin
        constructor'larini otomatik calıistiran bir
        yapi kurmustur.

        Ornegin biz child class'inda
        Child class'indan bir obje olusturmak istedigimizde
        Child cons. ini kullaniriz.

        Java Child(){} gordugunde
        once parent'in cons.'ini calistirmam lazim der
        buradan Parent cons. gider
        Parent class'inda Parent(){} gorunce
        once bunun parent'inin yani Grandparent cons.
        calismasi gerekir der.
        Boylece extends keyword olmayan class'a kadar gider
        ve oradan baslayarak tum constructor'lari asagi
        dogru calistirir.
         */
    }
}
