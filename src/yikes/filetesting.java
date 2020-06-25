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
    }
}
