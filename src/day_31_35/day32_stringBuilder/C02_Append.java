package day_31_35.day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Java daha ne yapsin");

        sb.append("?");
        System.out.println(sb); // Java daha ne yapsin?

        sb.append(5);
        System.out.println(sb); // Java daha ne yapsin?5

        sb.append(true);
        System.out.println(sb); // Java daha ne yapsin?5true

        sb.insert(4," her seyi dusunmus, ");
        System.out.println(sb); // Java her seyi dusunmus,  daha ne yapsin?5true
        // araya ekleme yapmak istedigimizde append degil insert kullanmaliyiz

        sb.insert(22," valla valla", 7,12);// start-end yazdigimiz yeni ifadenin baslangic bitis kismi
        System.out.println(sb);

        // append istedigimiz String'i hep en sona ekler!
    }
}
