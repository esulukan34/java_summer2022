package day_26_30.day27_staticKeyword;

public class Rope {
    public static void swing(){
        System.out.println("swing ");
    }
    public void climb(){
        System.out.println("climb ");

    }
    public static void play(){
        swing();
        //climb();
    }

    public static void main(String[] args) {
        Rope rope=new Rope();
        rope.play();
        Rope rope2=null;
        rope.play();
    }
}
