package yikes;
import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;
public class challenge5 {
    // import and run Scanner
// ask user for input
// use if else statements
// find a way to differentiate odd numbers
// loop number through all conditions
// print out line weird or not
    public static int in;
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("input number between 1 and 137: ");
            Integer in = input.nextInt();
            if (in < 1 || in > 137) {
                  startOver();
            } else if (in > 1 && in < 137) {
                playGame(in);
            }
        }
        public static void startOver(){
            Scanner input = new Scanner(System.in);
            System.out.print("choose a different number");
            System.out.println("input number between 1 and 137: ");
            Integer n = input.nextInt();
        }
                public static void playGame(int in){
            if (in>20){
                System.out.print("not weird ");
            } else if (in>6 && in<20){
                System.out.print("weird ");
            } else if (in>2 && in<5) {
                System.out.print("not weird ");
            }
            System.out.print("but ");
            if (in % 2 != 0) {
                System.out.print("weird ");
            } else {
                System.out.print("not weird ");
            }
        }
    }
