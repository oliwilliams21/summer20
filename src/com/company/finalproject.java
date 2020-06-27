package com.company;
import java.awt.*;
import java.io.IOException;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.*;
/* 
import all the classes
import the image
delcare your varibles- like score and scanner and count
aplie your image
ask the player ther name
collect it and make a new string name that uses reutern method plername with the string player name
then it prints what is returned
run player name method:
maek a string finised
have finsihed hello playernaem pinrt fished
return finished
run method ask
method ask:
ask if they want to play numbers or words
collect there anwser
make if else statement if number so playt nuber game
if word do play word game
if qnything else so else do ask again
then while the awser doe snot contain number or word to reapeat the ask
play numbergame/ words game methods (beuase they are pretty much the same:
tell them to guess a number between 1 and 100
make a scanner
collected the number and use file reader to read the file
make else if stament for the reading of the file by useing the bollean == truw
if the anser they  is in the file then say you got one and add to there score and count
if it is not in the file say better luck next time and jsut add to ther count
then loop in the play again mothod
play again method:
make a scanner
ask if they want to play again
make a string to collect that awser
if the anwser contant y then
print a design with the th infornation for the currect score
if the answer contain n proint a desgin with the score and the count of now many times they played
*/
public class finalproject extends JFrame {
    private ImageIcon image;
    private JLabel label;
    finalproject() {
        setLayout(new FlowLayout());
        image = new ImageIcon(getClass().getResource("splah.jpg")); // shows the image welcome screen
        label= new JLabel(image);
        add(label);
    }
    public static int count; //define main varibles
    public static int score;
    public static void main (String[] args) throws IOException {
        finalproject gui = new finalproject();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setTitle("Image Program");
        gui.pack();

        System.out.println("what is your name, player? "); // asks them there name and then print there name and return the finshed product
        Scanner whatname = new Scanner(System.in);
        String playername = whatname.nextLine();
        String name = Playername(playername);// return method for asking the name of the player
        System.out.println(name);
        ask(); // asks the play which game then want to  play
    }

    public static void ask() throws FileNotFoundException {
        System.out.println("do you want to guess numbers or words?: ");
        Scanner ask = new Scanner(System.in);
        String askstring = ask.nextLine();
        if (askstring.contains("number")) {
            playnumbergame(); // send them to number game
        } else if (askstring.contains("word")) {
            playwordgame(); // send them to work game
        } else do {
            ask();// asks them again if the aswser does not contain number or word
        } while (!askstring.contains("number" + "word"));
    }
    public static void playnumbergame() throws FileNotFoundException {
        System.out.println("Guess number (hint: it's between 1 and 100): ");
        Scanner number = new Scanner(System.in);
        String numberguess = number.next();
        Scanner filereader = new Scanner(new File("/Users/lillythieberg/IdeaProjects/largedeisng2/src/com/company/data.txt")); // calls to the file
        String filenumber = filereader.findInLine(numberguess); // see if the useers asner is in the file
        while (filereader.hasNextLine()) {
            filenumber = filenumber + filereader.nextLine(); // adds file reader next line to file number
        }
        if (filenumber.contains(numberguess)) {
            System.out.println("you got one!");
            boolean userhaswon = true; // if ther is the asner is the file then truw
            if (userhaswon == true) {
                ++score; // adds to score
                ++count; // adds to count
            }
        } else {
            ++count; // adds to count
            System.out.println("better luck next time"); // else is the other option is it is not ture and the anser id not in the file
        }
        System.out.println();
        playagain();
    }

    public static void playwordgame() throws FileNotFoundException {
        System.out.print("Guess word (hint: it's an animal, a color, or a food): ");
        System.out.println();
        Scanner word = new Scanner(System.in);
        String wordguess = word.next();
        Scanner filereader = new Scanner(new File("/Users/lillythieberg/IdeaProjects/largedeisng2/src/com/company/data.txt")); // calls to the file
        String filewords = filereader.findInLine(wordguess); // see if the useers asner is in the file
        while (filereader.hasNextLine()) {
            filewords = filewords + filereader.nextLine(); // adds file reader next line to file number
        }
        if (filewords.contains(wordguess)) {
            System.out.println("you got one!");
            boolean userhaswon = true; // if ther is the asner is the file then truw
            if (userhaswon == true) {
                ++score; // adds to score
                ++count;// adds to count
            }
        } else {
            System.out.println("better luck next time"); // else is the other option is it is not ture and the anser id not in the file
            boolean userhaslost;
            count ++; // adds to count
        }

        playagain();
    }

    public static void playagain() throws FileNotFoundException {
        Scanner repeat = new Scanner(System.in);
        System.out.println("Would you like to play again?"); // ask is they want to play again
        String playagain = repeat.nextLine();
        if (playagain.contains("y")) { // if ther awser sontain y then they will tell them there scorce and then do ask again
            System.out.println("********************************");
            System.out.println("* This is your current score,: " + score + " *");
            System.out.println("********************************");
            ask();
        } else if (playagain.contains("n")) { // the the anser contain n they they will have there s or printed and the number of times they played
            System.out.println("*****************************");
            System.out.println("*  Thank you for your time  *");
            System.out.println("*This is your final score :" + score + "*");
            System.out.println("*    You played "+  count + " times     *");
            System.out.println("*****************************");
        }
    }
    public static String Playername(String playername) {
        String finshied;
        finshied = "Hello "+ playername+"!"; // make it say helep playername
        return finshied; // returns finsed to be print
    }
}
