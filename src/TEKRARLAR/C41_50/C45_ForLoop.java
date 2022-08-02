package TEKRARLAR.C41_50;

public class C45_ForLoop {
    // verilen String'teki kullanilan harfleri
    // tekrarsiz olarak yazdirip
    // kelimede kullanilan farkli harf sayisini veren bir method yaziniz
    public static void main(String[] args) {

        String input = "Java hava civa";
        System.out.println("input = " + input);
        tekrarsizYap(input);
    }

    private static void tekrarsizYap(String input) {
        String yeniInput = input.substring(0,1);
        System.out.print(yeniInput);

        for (int i = 1; i <input.length() ; i++) {
            if(!yeniInput.contains(input.substring(i,i+1))){
                System.out.print(input.substring(i,i+1));
                yeniInput +=input.substring(i,i+1);
            }
        }
        System.out.println("");
        System.out.print(yeniInput);
    }
}
