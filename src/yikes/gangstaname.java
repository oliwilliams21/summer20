package yikes;
//oli williams
//pseudocode:
//input scanner
//ask user for name (system.out.print)
//take indexes of names in string (name.substring)
//print out gangsta name (system.out.print)
import java.util.Scanner;
public class gangstaname {
    public static void main(String[] args) {
//        new scanner
        Scanner input = new Scanner(System.in);
//        ask user for input
        System.out.print("Type your name, playa: ");
        String name = input.nextLine();
// split name into first/last name and initials
        String first = name.substring(0, name.indexOf(" "));
        String last = name.substring(name.indexOf(" ") + 1);
        last = last.toUpperCase();
        String fInitial = first.substring(0, 1);
//  print out gangstaname output
        System.out.println("Your gangsta name is \"" + fInitial +
                ". Diddy " + last + " " + first + "-izzle\"");
    }
}