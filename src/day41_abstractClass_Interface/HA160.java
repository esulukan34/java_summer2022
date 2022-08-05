package day41_abstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public class HA160 extends FMercedes{
        /*
        Abstract parent silsilesinden gelen ilk concrete class
        parent'i olan tum class'ilardaki abstract method'lari
        concrete hale donusturmek(override) ZORUNDAIR.

        Bu kuralin istisnasi parent class'lardan herhangi birinde
        concrete hale donusturulmus abstract methodlardir.
         */
        public static void main(String[] args) {

            HA160 arb1 = new HA160();
            // concrete bir class'dan istedigimiz bir objeyi uretebiliriz

            FMercedes arb2 = new FMercedes();
            // mercedes'e concrete

            FMercedes arb3 = new HA160();

            //EToyota arb4 = new EToyota();
            EToyota arb5 = new GCoralla();
            // Abstract class'lar constructor barindirir ama obje uretemezler
            // Toyota class'i abstract class oldugundan obje uretilemez
            /*
            List<String> list1 = new List<String>();
            List<String> list2 = new ArrayList<>();

            Abstract bir class'in ozelliklerini tasiyan bir obje olusturmak istedigimizde
            Data turunu istedigimiz abstract class
            constructor'i ise child olan concrete bir class'dan seceriz
             */
        }

}
