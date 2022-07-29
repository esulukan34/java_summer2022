package day35_inheritancedeConstructorKullanimi;

public class FMemur extends EMuhasebe {
    /*
    exyends keyword kullanilan class'larda ister default constructor
    bulunsun istersekte biz yeni constructor(lar) olusturalim
    Java constructor'in ilk satirina super(); constructor call
    yazar

    super(); constructor call, default constructor'a benzer
    gorunmese de orada vardir ve calisir. ancak biz ilk satira
    farkli bir constructor call yazarsak Java super();'i siler

    Eger biz mudahele edip kendi constructor call'umuzu olusturmazsak
    Java'nin default olarak olusturdugu cons. all her zaman parametresizdir
    super();
     */
    FMemur() {
        System.out.println("Memur parametresiz constructor. ");
    }

    FMemur(String isim) {
        System.out.println("Memur parametreli constructor. ");
    }

    public static void main(String[] args) {

        FMemur mmr1 = new FMemur("ali");

    }
}
