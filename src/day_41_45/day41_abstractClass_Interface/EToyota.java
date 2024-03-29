package day_41_45.day41_abstractClass_Interface;

public abstract class EToyota extends DAraba{

    @Override
    protected void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanir");
    }
    /*
    Parent class'daki standart belirleyici methodlarin
    (abstract method) tamami child class tarafindan override edilmelidir.

    concrete method'larin override edilme mecburiyeti yoktur
    istersek override edebiliriz, istemezsek etmeyiz.

    Aslinda Toyota class'i da obje uretebilecegimiz bir class degil
    bu durumda eger proje tasarimi yapiyorsaniz
    Toyota class'inin da abstract yapmaniz guzel olur
     */

}
