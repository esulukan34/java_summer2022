package day_41_45.day43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public void yakit ();
    public abstract String aku();
    /*
    normal bir class da oldugumuzu dusunseek
    iki tane access modifier ihtimali OLAMAZ

    asagidaki method'da gpreceginiz gibi
    interface'de istisnai olarak body'si olan method'lar olusturulabilir
    Bu ozellik Java ('den sonra kullanilmaya baslamistir.
    Bu ozellikten once, bir interface'e yeni bir method eklememiz gerektiginde
    eskiden beri bu interface'i implement eden tum class'lara gidip
    yeni eklenen method'u override etmemiz gerekirdi.

    bu ozellik sayesinde basina default veya static keyword ekleyerek
    interface'de yeni ve body'si olan bir method olusturursak
    bu method 'un child class'lar tarafindan override edilme MECBURIYETI OLMAZ
    ve eskiden implement etmis class'lari degistirmemiz gerekmez

    Bu istisnai bir durumdur ve interface icin olusturulan genel kurallari bozmaz

    Bu method'larin b ody'si olsa da bunlara concrete method denmez
    ama override edilme mecburiyetleri yoktur.

    buradaki default kelimesi access modifier degil
    istisnai durumun belirtilmesi icindir.

    0 zaman nicin 2 keyword (static ve default) tanimlanmistir?
    Bu ikşi farkli kelimenin amaci child class'lardan bu method'a
    nasil erisilebilecegini belirlemek icindir
    static keyword kullanilirsa, child class'dan bu method'a erismek
    icin InterfaceAfi.methodAdi yeterli olur

    default keyword kullanilirsa, method'a erismek icin obje olusturulmalidir

     */

    public default void teker (){
        System.out.println("default.....tum arabalarin tekeri vardir");
    }

    public static void direkssiyon(){
        System.out.println("static......tum arabalarin direksiyonu vardir");
    }
}
