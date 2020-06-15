package yikes;
import java.util.Scanner;

public class lettercount2 {
    public static String firstWord;
    public static int indexOf;
    public static char letter;
    public static int count;
    public static String secondWord;
    public static void main(String[] args) {
        Scanner screen = new Scanner(System.in);
        System.out.println("Say something!");
        String phrase = screen.nextLine();
        int indexOf = phrase.indexOf(" ");
        firstWord = phrase.substring(0, indexOf + 1);// "Peter "
        secondWord = phrase.substring(indexOf+1, 2);
        // phrase = phrase - firstWord
        phrase = phrase.replace(firstWord," ");
        char letter = ' ';
        int count = 0;
        countfwletters (letter,count);
//        countswletters (letter,count);
    }
        public static void countfwletters (char letter, int count){
            for (int index = 0; index < firstWord.length(); index++) {
                letter = firstWord.charAt(index);
                if (letter != ' ') {
                    count++;
                    String temp = firstWord.substring(index + 1);
                    indexOf = temp.indexOf(letter);
                    while (indexOf >= 0) {
                        count++;
                        temp = temp.substring(indexOf + 1);
                        indexOf = temp.indexOf(letter);
                    }
                    countinglettersmessage (letter,count);
                    // find the rest of the letter of your message maybe use a method??
                    //  replace the letter you just finished in the firstword with a ' '
                    firstWord=firstWord.replace(letter,' ');
                    System.out.println(letter + " " + count);
                    count = 0;
                    firstWord = firstWord.replaceAll(letter+" ", "");
                }
            }
        }
//    public static void countswletters (char letter, int count){
//        for (int index = 0; index < secondWord.length(); index++) {
//            letter = secondWord.charAt(index);
//            if (letter != ' ') {
//                count++;
//                String temp = secondWord.substring(index + 1);
//                indexOf = temp.indexOf(letter);
//                while (indexOf >= 0) {
//                    count++;
//                    temp = temp.substring(indexOf + 1);
//                    indexOf = temp.indexOf(letter);
//                }
//                countinglettersmessage (letter,count);
//                // find the rest of the letter of your message maybe use a method??
//                //  replace the letter you just finished in the firstword with a ' '
//                secondWord=secondWord.replace(letter,' ');
//                System.out.println(letter + " " + count);
//                count = 0;
//            }
//        }
//    }
        public static void countinglettersmessage (char letter, int count){

    }
    }