package yikes;
//oli williams
//pseudocode:
//create size function
//create method for top half of mirror
//use for loop for line and for characters, and create a public static size variable
//create method for bottom half of mirror
//call methods in main
//print lines of top and bottom
public class typecasting {
//    declare size variable
    public static final int SIZE=10;
    public static void main(String[] args) {
//        call methods
        top();
        bottom();
        }
//    }
    public static void top(){
//        method for top of mirror
        for (int line = SIZE; line>=0; line--) {
//            start with the hexadecimal ID for A
            char letter=65;
            for (byte count=0; count<line; count++){
                System.out.print((char)(letter+count)+" ");
            }
            System.out.println();
        }
    }
    public static void bottom (){
//        method for bottom of mirror
        for (int line = 0; line<=SIZE; line++) {
            char letter=65;
            for (byte count=0; count<line; count++){
                System.out.print((char)(letter+count)+" ");
            }
            System.out.println();
        }
    }
}

