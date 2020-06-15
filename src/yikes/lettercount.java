package yikes;
import java.util.Scanner;
public class lettercount {
    public static String firstWord;
    public static void main(String[] args) {
        input();
        calculations();
    }
    public static void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("type your phrase: ");
        String phrase= input.nextLine();
        int indexOf = phrase.indexOf(" ");
        firstWord = phrase.substring(0, indexOf);
//        phrase=phrase.substring(phrase-firstWord);
//       String stringObject= stringObject.indexOf(" ");
//        stringObject.substring(0, 5);
    }
    public static void calculations() {
        char letter = 0;
        int count = 0;
        firstWord.length();
        char firstletter;
        for (int i = 0; i < firstWord.length(); i++) {
            firstletter = firstWord.charAt(i);
            while (firstletter !=' ')
            count++;
            String temp = firstWord.substring(i+1);
            int index = temp.indexOf(firstletter);
            System.out.println(temp+index);
            while (index > 0) {
                count++;
                temp = temp.substring(i+1);
                index = firstWord.substring(index+1).indexOf(firstletter);
//                Delete letter from firstWord
            }
            firstWord.indexOf(letter);
        }
        System.out.print(letter + count);
    }
}

