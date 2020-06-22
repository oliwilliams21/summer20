package yikes;
import java.util.*;
//input scanner
//ask user for string
//return method - have one
//separate even and odd indexed numbers
//print on separate lines
public class stringchallenge {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("input word: ");
        String wholephrase = input.nextLine();
        String odd="";
        String even="";
        for(int oddindex=1; oddindex<=wholephrase.length(); oddindex+=2){
                odd= odd+wholephrase.charAt(oddindex);
        }
        System.out.println();
        for(int evenindex=0; evenindex<=wholephrase.length(); evenindex+=2) {
            even= even+wholephrase.charAt(evenindex);
        }
        String answer = even+" "+odd;
        System.out.print(answer);
        }
}
