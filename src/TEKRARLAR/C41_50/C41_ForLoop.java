package TEKRARLAR.C41_50;

public class C41_ForLoop {
    /*
    Verilen bir pozitif tamsayinin pozitif tam bolenlerini yazdiralim
     */
    public static void main(String[] args) {

        int sayi = 20;
        int bolenler = 1;

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                 bolenler =i;
                System.out.print(bolenler + " ");
            }

        }
    }
}
