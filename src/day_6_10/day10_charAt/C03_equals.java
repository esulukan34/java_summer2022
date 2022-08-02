package day_6_10.day10_charAt;

public class C03_equals {
    public static void main(String[] args) {
        String str1= "Ali Can";
        String str2= "ALİ CAN";
        String str3= "Ali Can" + "";
        String str4= "Ali Can";
        String str5= new String("Ali Can");

        System.out.println(str1 == str2); // false

        System.out.println(str1 == str3); // true

        System.out.println(str1.equals(str3)); // true

        System.out.println(str1==str5);//
        System.out.println(str1.equals(str5));//

        System.out.println(str1.equals(str4));
        System.out.println(str3.equals(str5));
        System.out.println(str3 == str5);

        /*
        Stringlerde aynı String olsa bile == her zaman calismaz.
        Emin olmak isterseniz equals() method'unu kullanmalisiniz

        equals() kullandığımızda dikkat edecegimiz TEK SEY metinlerin
        bire-bir aynı olmasıdır
         */

    }
}
