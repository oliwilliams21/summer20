package yikes;
//oli williams
//pseudocode:
//make method for repeated portions (top box bottom box and cone)
//use System.out.print lines for printing characters
//call method to main class
public class challenge1 {
    public static void main(String[] args)
    {
//        calling methods for different box types
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
//        method of print lines for cone
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }
    public static void TopBox(){
//        method of print lines for top box
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
    }
    public static void BottomBox(){
//        method of print lines for bottom box
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }

}
