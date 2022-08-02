package day_36_40.day37_overriding;

public class EToyota extends DAraba{


    void marka(){
        /*super.marka()
        eger hem ovirridden hem de overridding method'un calismasini istersek
        ilk satira super.marka() yazabiliriz
         */
    }


    @Override
    void motor() {
        System.out.println("Toyota araclar marka motor kullanir");
    }
}
