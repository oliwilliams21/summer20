package yikes;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class filetesting {
    public static void main (String [] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("/Users/oil/IdeaProjects/summer20/src/yikes/data.txt"));
        while (input.hasNextLine()) {
            String text = input.next();
            System.out.println(text);
        }
        input.close();
        trial();
    }
    public static void trial(){
        System.out.println("*****************************");
        System.out.println("* Thank you for your time  *");
        System.out.println("*This is your final score: 7" +"*");
        System.out.println("*****************************");
    }
}
