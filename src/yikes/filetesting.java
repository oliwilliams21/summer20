package yikes;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class filetesting {
    public static void main (String [] args) throws FileNotFoundException{
       Scanner input = new Scanner (new File("C:\\Users\\oil\\IdeaProjects\\summer20\\src\\yikes\\data.txt"));
       String text =input.next();
       System.out.println(text);
       input.close();
    }
}
