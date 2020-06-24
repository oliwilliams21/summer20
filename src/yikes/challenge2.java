package yikes;
//oli williams
//pseudocode:
//print top line - use size variable throughout program to make sizing and resizing easier
//print top box - use a for loop for spaces, line amounts, and slashes, relative to size
//print bottom box
//print top line again
public class challenge2 {
//    make size function to easily change size
    public static final int SIZE=10;
    public static void main(String[] args) {
//        call all methods to the main
        line();
        TopBox();
        BottomBox();
        line();
        BottomBox();
        TopBox();
        line();
    }
    public static void TopBox() {
//        method for top half
        for (int line = 1; line<SIZE+1; line++) {
            System.out.print("|");
            for (int space = 1; space <= (SIZE+1)-line; space++) {
                System.out.print(" ");
            }
            for (int slash=1; slash<=line-1; slash++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int backslash=1; backslash<=line-1; backslash++) {
                System.out.print("\\");
            }
            for (int space = 1; space <= (SIZE+1)-line; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
            }
//        System.out.println("|    *    |");
//        System.out.println("|   /*\\   |");
//        System.out.println("|  //*\\\\  |");
//        System.out.println("| ///*\\\\\\ |");
    }
    public static void BottomBox() {
//        method for bottom half
        for(int line=1; line<SIZE+1; line++){
            System.out.print("|");
            for(int space = 1; space<=0+line; space++) {
                System.out.print(" ");
            }
            for(int backslash=1; backslash<=SIZE-line; backslash++){
                System.out.print("\\");
            }
            System.out.print("*");
            for(int slash=1; slash<=SIZE-line; slash++){
                System.out.print("/");
            }
            for(int space=1; space<=0+line; space++){
                System.out.print(" ");
            }
            System.out.println("|");
//        System.out.println("| \\\\\\*/// |");
//        System.out.println("|  \\\\*//  |");
//        System.out.println("|   \\*/   |");
//        System.out.println("|    *    |")
        }
    }
    public static void line () {
//        method for top and bottom lines
        System.out.print("+");
        for(int dash=1; dash<=2*SIZE+1; dash++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
