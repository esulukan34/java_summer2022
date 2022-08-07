package day_41_45.day41_abstractClass_Interface;

public class GCoralla extends EToyota{



    @Override
    protected void yakit() {

    }
    /*
        Coralla class'inin 2 tane parent'i var
        coralla parent'larinin iksinin de standartlarina (abstract method)
        uymak zorundadir.

        Concrete bir class parent'i olan tum abstract class'larda
        abstract olan method'lari implement etmek ZORUNDADIR
        Ancak Parent silsilesinde override edilerek concrete yapilan
        method'lari override etmek zorunda DEGILDIR
        */

    @Override
    protected void kaporta() {

    }
}
