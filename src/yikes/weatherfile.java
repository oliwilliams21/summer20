package yikes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class weatherfile {
    public static void main (String [] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("/Users/oil/IdeaProjects/summer20/src/yikes/weather.txt"));
        while (input.hasNextLine()) {
            if (input.hasNextDouble()){
                String text = input.next();
                System.out.println(text);
            }
        }
        input.close();
    }
}
