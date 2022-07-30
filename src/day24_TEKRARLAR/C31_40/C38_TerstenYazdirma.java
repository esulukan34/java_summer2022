package day24_TEKRARLAR.C31_40;

public class C38_TerstenYazdirma {
    // input olarak verilen Stringi terse cevirip yazdiran bir method olusturun

    public static void main(String[] args) {
        String input = "Java kolay";
        System.out.println("input = " + input);
        tersYaz(input);

    }

    private static void tersYaz(String input) {
        String tersInput = input.substring(input.length()-1);

        for (int i = input.length()-2; i >=0 ; i--) {
            tersInput += input.substring(i,i+1);
        }
        System.out.println("tersInput = " + tersInput);
    }
}

