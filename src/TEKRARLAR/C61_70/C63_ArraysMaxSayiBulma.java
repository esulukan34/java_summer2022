package TEKRARLAR.C61_70;

public class C63_ArraysMaxSayiBulma {
    //Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.
    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 0, -9, 4, 46, 5, 89, 7};

        maxSayi(arr);
        minSayi(arr);
    }

    private static void minSayi(int[] arr) {
        int kucuk = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(kucuk>arr[i]){
                kucuk=arr[i];
            }
        }
        System.out.println("kucuk sayi " + kucuk);
    }

    private static void maxSayi(int[] arr) {
        int buyuk = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(buyuk<arr[i]){
                buyuk=arr[i];
            }
        }
        System.out.println("buyuk sayi " + buyuk);
    }
}
