package day07_ifStatements;

public class C01_AndOperatorleri {
    public static void main(String[] args) {

        int a=10;
        int b=15;
        int c=20;

        System.out.println(a>0 && b<20 && c>=b); // true


        System.out.println( a<0 && b<20 && c>=b);// false
        /*
        java and operatoru konusunda bize iki dsecek sunar. eger && kullanırsak
        ilk false false buldugunda artık sınucun false olacagını bilir ve geriye kalan
        sartlari inlecemez

        & kullanırsak tum sartları kontrol eder sonra sonucu belirler.

        bu calisma usulunden dolai & operatoru,&& operatorune gore daha yavas calısabilir.

        */


        System.out.println( a<0 & b<20 & c>=b); // false


    }
}
