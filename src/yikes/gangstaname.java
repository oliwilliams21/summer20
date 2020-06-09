package yikes;

import java.util.Scanner;

public class gangstaname {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name, playa: ");
        String name = console.nextLine();
// split name into first/last name and initials
        String first = name.substring(0, name.indexOf(" "));
        first = first.toUpperCase();
        String last = name.substring(name.indexOf(" ") + 1);
        String lInitial = last.substring(0, 1);
        System.out.println("Your gangsta name is \"" + lInitial +
                ". Diddy " + first + "-izzle\"");
    }
}