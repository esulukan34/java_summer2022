package day_6_10.day06_concatenation;

public class C02_Concatenation {
    public static void main(String[] args) {

        String str1= "Java";
        String str2= "Guzeldir";
        int sayi1=5;
        int sayi2=4;

        //yukardaki variable'ları kullanarak istenen metinleri yazdıralım

        System.out.println(str1+" "+str2+" "+sayi1+sayi2);// java Guzeldir 54
        System.out.println(str1+" "+str2+" "+ (sayi1+sayi2)); // Java Guzeldir 9
        System.out.println(sayi1+ sayi2+" "+str1 );// 9 Java
        System.out.println(""+sayi1+sayi2+" "+str2);//54 Guzeldir

        System.out.println(str1.concat(str2)); // JavaGuzeldır
        System.out.println(str1.concat(" ").concat(str2)); //Java Guzeldir



    }
}
