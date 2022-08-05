package day41_abstractClass_Interface;

public class FMercedes extends DAraba{
    @Override
    protected void yakit() {
        /*
        Abstract bit parent'in concrete child class inherit ederse
        parent abstract class'taki tum abstract methodlari override
        etmek zorundadir.

        abstract bir class abstract baska bir class'i parent edinirse (Toyota gibi)
        parent class'taki tum abstract methodlari override etmek zorunda degildir

         */
    }

    @Override
    protected void kaporta() {

    }

    @Override
    protected void motor() {

    }
}
