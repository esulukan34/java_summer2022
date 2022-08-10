package day_41_45.day43_interfaces_iterators;

public class M02_Child implements I01_InterfaceBodyOlanMethod {
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
    /*
    Parent interface'de abstract olan 3 method'u implement ettigimizde
    Java itirazini durdurur
    sonradan ekledigimiz
    default veya static keywordile tanimladigimiz method'lari
    implement etmememiz sorun olusturmadi.

    0 zaman nicin 2 keyword (static ve default) tanimlanmistir?
    Bu ikşi farkli kelimenin amaci child class'lardan bu method'a
    nasil erisilebilecegini belirlemek icindir
    static keyword kullanilirsa, child class'dan bu method'a erismek
    icin InterfaceAfi.methodAdi yeterli olur

     */
    public static void main(String[] args) {

        I01_InterfaceBodyOlanMethod.direkssiyon();

        M02_Child obj = new M02_Child();
        obj.teker();

    }
}
