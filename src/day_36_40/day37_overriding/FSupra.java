package day_36_40.day37_overriding;

public class FSupra extends EToyota{

    void yakit(){
        System.out.println("Supra benzin kullanir");
        /*
        private method'lar override edilemez
        Eger child class'da parent class'daki private
        method ile ayni signature'da bir method olusturursani<
        bu overridding method OLMAZ
         */
    }

    @Override
    void motor() {
        /*
        @override notasyonu java'ya bir gorev verir
        Java, bu notasyonla birbirine bagli iki methodu
        surekli kontrol eder.
        Eger parent class'daki overridden method'u silerseniz
        CTE verir

        @Override notasyonu kullanmak mecburi degildir.
        Eger Overridding method silinirse kodun CTE vermesini
        istersek @Override notasyonu kullanmaliyiz

         */
    }
}
