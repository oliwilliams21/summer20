package yikes;

import java.util.Scanner;

public class stringchallengemini {
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
