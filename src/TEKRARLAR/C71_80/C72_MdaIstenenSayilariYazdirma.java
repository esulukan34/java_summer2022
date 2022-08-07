package TEKRARLAR.C71_80;

public class C72_MdaIstenenSayilariYazdirma {
    /*
        Verilen 2 katli bir multi-dimensional array'de
        outer indeksi inner indeksi aynı olan sayıların toplamını bulunuz

        int[][] sayilar ={{1,5,6,9,4},{2,5,5,8},{3,1,6}};
        [0][0] + [1][1] + [2][2] ....
        */
    public static void main(String[] args) {
        int[][] sayilar ={{1,5,6,9,4},{2,5,5,8},{3,1,6}};

        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 1; j < sayilar[i].length; j++) {
                if(i==j){
                    toplam += sayilar[i][j];
                }
            }
        }
        System.out.println(toplam);
    }
}
