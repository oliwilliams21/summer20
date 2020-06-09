package yikes;

public class mirrorchallenge {
public static final int SIZE=4;
    public static void main(String[] args)
    {
        line();
        top();
//        bottom ();
//        System.out.println("|      <><>      |");
//        System.out.println("|    <>....<>    |");
//        System.out.println("|  <>........<>  |");
//        System.out.println("|<>............<>|");
        System.out.println("|<>............<>|");
        System.out.println("|  <>........<>  |");
        System.out.println("|    <>....<>    |");
        System.out.println("|      <><>      |");
        line();
    }
    public static void line () {
        System.out.print("#");
        for(int dash=0; dash<4*SIZE; dash++){
            System.out.print("=");
        }
        System.out.println("#");
    }
    public static void top () {
        for(int line=1; line<SIZE+1; line++){
            System.out.print("|");
            for(int space=1; space<=-2*line+2*SIZE; space++){
                System.out.print(" ");
            }
            System.out.print("<>");
            for(int dot=1; dot<=SIZE*line-SIZE;dot++){
                System.out.print(".");
            }
            System.out.print("<>");
            for(int space=1; space<=-2*line+2*SIZE; space++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    public static void bottom (){
        for(int line=1; line<SIZE+1; line++){
            System.out.print("|");
            for(int space=1; space<=6-line*6; space--){
                System.out.print(" ");
            }
            System.out.print("<>");
            for(int dot=1; dot<=4*SIZE-SIZE*line; dot--){
                System.out.print(".");
            }
            System.out.print("<>");
            for(int space=1; space<=6-line*6; space--){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
