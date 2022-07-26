package day32_stringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Kayra");

        sb.substring(0,3); // Kayra
        System.out.println(sb);

        // bu method Atring dondurdugu icin
        // StringBuilder'in eski halini degistiremez

        sb.subSequence(0,3); // Kayra
        System.out.println(sb);
    }
}
