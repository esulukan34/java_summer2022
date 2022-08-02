package TEKRARLAR.C41_50;

public class C46_ForLoop {
    /*verilen en ve boy degerine gore
     *'lardan olusan bir dikdörtgen olusturalım'
     boy : 3 en :4
     ****
     ****
     ****
      */
    public static void main(String[] args) {
       int boy= 3;
       int en = 4;
        for (int i = 1; i <=boy ; i++) {
            for (int j = 1; j <=en ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
