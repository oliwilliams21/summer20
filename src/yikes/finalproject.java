package yikes;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class finalproject {
    String gamechoice;
    public static void main (String[] args) throws FileNotFoundException {
        ask();
        playagain();
//        Scanner input = new Scanner(System.in);
//        String gamechoice = input.nextLine();
//        if (gamechoice.contains("number")){
//            playnumbergame();
//        } else if (gamechoice.contains("word")) {
//            playwordgame();
//        } else do{
//        } while (!gamechoice.contains("number" + "word"));
    }
    public static void ask () throws FileNotFoundException {
        System.out.println("do you want to guess numbers or words?: ");
        Scanner ask = new Scanner(System.in);
        String askstring = ask.nextLine();
        if (askstring.contains("number")){
            playnumbergame();
        } else if (askstring.contains("word")) {
            playwordgame();
        } else do{
            ask();
        } while (!askstring.contains("number" + "word"));
    }
    public static void playnumbergame () throws FileNotFoundException {
        System.out.print("Guess number (hint: it's between): ");
        Scanner number = new Scanner (System.in);
        String numberguess = number.nextLine();
        Scanner filereader = new Scanner(new File("/Users/oil/IdeaProjects/summer20/src/yikes/finalproject.txt"));
        String filenumber = filereader.findInLine(numberguess);
        if (filenumber.matches(numberguess)){
            System.out.println("you got one!");
        } else
            System.out.print("better luck next time");
        System.out.println();
        playagain();
    }
    public static void playwordgame () throws FileNotFoundException {
        System.out.print("Guess word (hint: it's an animal): ");
        System.out.println();
        Scanner word = new Scanner (System.in);
        String wordguess = word.nextLine();
        Scanner filereader = new Scanner(new File("/Users/oil/IdeaProjects/summer20/src/yikes/finalproject.txt"));
        String filewords = filereader.findInLine(wordguess);
        if (filewords.contains(wordguess)){
            System.out.println("you got one!");
        } else
            System.out.print("better luck next time");
        playagain();
    }
    public static void playagain () throws FileNotFoundException {
        Scanner repeat = new Scanner(System.in);
        System.out.println("Would you like to play again?");
        String playagain = repeat.nextLine();
        if (playagain.contains("y")){
            System.out.println("This is your current score: ");
            ask();
        } else if (playagain.contains("n")) {
            System.out.println("Thank you for your time");
            System.out.print("This is your final score");
        }
    }
    }
//notes
//do while loop? - for playing game so game repeats
//for each time system outputs you got one, int score = 0, score++
//int = score