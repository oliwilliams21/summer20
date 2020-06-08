package yikes;

public class challenge1 {

    public static void main(String[] args)
    {
        Top();
        TopBox();
        TopBox();
        System.out.println("+------+");
        System.out.println("|United|");
        System.out.println("|States|");
        System.out.println("+------+");
        BottomBox();
        BottomBox();
        Top();
    }
    public static void Top(){
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }
    public static void TopBox(){
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
    }
    public static void BottomBox(){
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }

}
