package day_41_45.day43_interfaces_iterators;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class M04_ListIterator {
    public static void main(String[] args) {
        /*
         ListIterator, Iterator interface'nin child interface'dir
         ama daha cok method'a sahiptir
         */
        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste); // [10, 20, 30]

        Integer temp;

        ListIterator lit1 = liste.listIterator();

        while (lit1.hasNext()) {
            temp = (Integer) lit1.next() + 3; // integer, object'in child'i oldugu icin sorun olmadi cast yaptik
            lit1.set(temp);
        }
        System.out.println(liste);

        System.out.println("*********************");

        List<Integer> liste2 = new ArrayList<>();
        liste2.add(10);
        liste2.add(20);
        liste2.add(30);
        System.out.println(liste2);

        Integer temp2;
        ListIterator lit2 = liste2.listIterator();

        while (lit2.hasNext()) {
            temp2 = (Integer) lit2.next() - 2; // integer, object'in child'i oldugu icin sorun olmadi cast yaptik
            lit2.set(temp2);
        }
        System.out.println(liste2);
    }
}
