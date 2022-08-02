package TEKRARLAR.C41_50;

public class C50_NestedForLoop {
     /*
        verilen string'i asagidaki gibi yazdiran bir program yazalim.
        input= Deniz
        D
        De
        Den
        Deni
        Deniz
         */
     public static void main(String[] args) {
     String input = "Deniz";
          for (int i = 0; i <input.length() ; i++) {
               for (int j = 0; j <=i ; j++) {
                    System.out.print(input.substring(j,j+1));
               }
               System.out.println("");
          }

     }
}
