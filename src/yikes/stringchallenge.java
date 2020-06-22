package yikes;
import java.util.*;
//input scanner
//ask user for string
//return method - have one
//separate even and odd indexed numbers
//print on separate lines
public class stringchallenge {
    public static Scanner word = new Scanner (System.in);
    public static String wholephrase = word.nextLine();
    public static String odd="";
    public static String even="";
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("how many words do you want to input(b/t 1 and 10): ");
        int wordcount = input.nextInt();
        for (int line=1; line <= wordcount; wordcount++) {
            String wholephrase;
        }
        System.out.print("what is your word: ");
        String wholephrase = word.nextLine();
        return answer;
    }
    public static String letters (String odd, String even){
        for(int oddindex=1; oddindex<=wholephrase.length(); oddindex+=2){
            odd= odd+wholephrase.charAt(oddindex);
        }
        System.out.println();
        for(int evenindex=0; evenindex<=wholephrase.length(); evenindex+=2) {
            even= even+wholephrase.charAt(evenindex);
        }
        String answer = even+" "+odd;
        return (answer);
    }
}
