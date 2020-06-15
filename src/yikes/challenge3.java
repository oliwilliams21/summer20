package yikes;
import java.util.*;

public class challenge3 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "Greenhill ";
        System.out.printf("Printing a string: %s\n", s);
        double doubly2 = Math.sqrt(d*i);
        double doubly3 = doubly2*d;
        System.out.println(i+" "+d+" "+ doubly2+ " "+doubly3);
        System.out.printf("This is my calculation: %.3f", doubly2);
        Scanner screen = new Scanner(System.in);
        System.out.println("Say something!");
        String phrase = screen.nextLine();

    }
}