package yikes;
public class taxtipchallenge {
    public static final int SIZE=100;
    public static void main(String[] args) {
        line();
        TopBox();
        BottomBox();
        line();
        BottomBox();
        TopBox();
        line();
    }
    public static void TopBox() {
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
        System.out.print("+");
        for(int dash=1; dash<=2*SIZE+1; dash++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
