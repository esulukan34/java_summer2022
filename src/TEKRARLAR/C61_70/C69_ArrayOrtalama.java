package TEKRARLAR.C61_70;

public class C69_ArrayOrtalama {
    //Deneme1- Verilen bir array'deki sayilarin ortalamasini bulan bir method olusturun
    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 2, 4, 7, 8, 1, 4, 10,12,13};
        double toplam = 0;

        ortalama(arr,toplam);

    }

    private static void ortalama(int[] arr, double toplam) {
        double ort = 0 ;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
            ort = toplam/arr.length;
        }
        System.out.println("sayilarin toplami : " + toplam);
        System.out.println(arr.length);
        System.out.println("ortalama : " +ort);
    }
}




