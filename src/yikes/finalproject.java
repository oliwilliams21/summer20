package yikes;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class finalproject {
    public static int score;
    public static Scanner whatname;
    public static String playername;
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("what is your name, player? ");
        Scanner whatname = new Scanner(System.in);
        String playername = whatname.nextLine();
        System.out.println("Hello "+ playername+"!");
        ask();
    }
    public static int count;
    public static void ask() throws FileNotFoundException {
        System.out.println("do you want to guess numbers or words?: ");
        Scanner ask = new Scanner(System.in);
        String askstring = ask.nextLine();
        if (askstring.contains("number")) {
            playnumbergame();
        } else if (askstring.contains("word")) {
            playwordgame();
        } else do {
            ask();
        } while (!askstring.contains("number" + "word"));
        for (int count=0; count<400; count++){
            ++count;
        }
    }
    public static void playnumbergame() throws FileNotFoundException {
        System.out.println("Guess number (hint: it's between 1 and 100): ");
        Scanner number = new Scanner(System.in);
        String numberguess = number.next();
        Scanner filereader = new Scanner(new File("/Users/oil/IdeaProjects/summer20/src/yikes/finalproject.txt"));
        String filenumber = filereader.findInLine(numberguess);
        while (filereader.hasNextLine()) {
            filenumber = filenumber + filereader.nextLine();
        }
        if (filenumber.contains(numberguess)) {
            System.out.println("you got one!");
            boolean userhaswon = true;
            if (userhaswon == true) {
                ++score;
            }
        } else
            System.out.println("better luck next time");
        System.out.println();
        playagain();
    }

    public static void playwordgame() throws FileNotFoundException {
        System.out.print("Guess word (hint: it's an animal, a color, or a food): ");
        System.out.println();
        Scanner word = new Scanner(System.in);
        String wordguess = word.next();
        Scanner filereader = new Scanner(new File("/Users/oil/IdeaProjects/summer20/src/yikes/finalproject.txt"));
        String filewords = filereader.findInLine(wordguess);
        while (filereader.hasNextLine()) {
            filewords = filewords + filereader.nextLine();
        }
        if (filewords.contains(wordguess)) {
            System.out.println("you got one!");
            boolean userhaswon = true;
            if (userhaswon == true) {
                ++score;
            }
        } else {
            System.out.println("better luck next time");
            boolean userhaslost;
        }
        playagain();
    }

    public static void playagain() throws FileNotFoundException {
        Scanner repeat = new Scanner(System.in);
        System.out.println("Would you like to play again?");
        String playagain = repeat.nextLine();
        if (playagain.contains("y")) {
            System.out.println("********************************");
            String name;
            System.out.println("* This is your current score,: " + score + " *");
            System.out.println("********************************");
            ask();
        } else if (playagain.contains("n")) {
            System.out.println("*****************************");
            System.out.println("*  Thank you for your time  *");
            System.out.println("*This is your final score :" + score + "*");
            System.out.println("*    You played "+  gamecount(count) + " times     *");
            System.out.println("*****************************");
        }
    }
    public static int gamecount (int gc ){
        gc = 1;
        gc++;
        return gc;
    }
}
