package TEKRARLAR.C51_60;

public class C58_DoWhileLoop {
        /*
        9'dan 190' a kadar 7'nin kati olan tamsayilari sayilari yazdirin
         */
        public static void main(String[] args) {
            int bas = 9;
            int bitis = 190;

        do{
            if(bas%7==0){
                System.out.print(bas + " ");

            }bas++;
        }while(bas<bitis);



        }
}
