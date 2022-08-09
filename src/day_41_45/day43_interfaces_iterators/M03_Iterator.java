package day_41_45.day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste); // [10, 20, 30]

        // Liste'deki tum elementleri INDEX KULLANMADAN 3 artirin
        for (Integer each : liste) {
            System.out.print(each +3 + " ");
        }



    }
}
