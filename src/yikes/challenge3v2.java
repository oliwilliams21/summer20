package yikes;

import java.util.Scanner;

public class challenge3v2 {
//    oli williams
//          pseudocode
//    declare variables: one of type int, one double, and one String
//    create scanner
//    read lines of input using scanner
//    initialize your variables with the right method
//    use the operator to perform operations
//    print the sum of plus int variable on a new line.
//    print the sum of plus double variable to a scale of one decimal place on a new line
//    concatenate with the string you read as input and print the result on a new line
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
//        declare original variable
        int i = 4;
        double d = 4.0;
        String s = "Greenhill ";
        System.out.println("integer:");
        Integer i2=keyboard.nextInt();
        System.out.println("double:");
        Double d2= keyboard.nextDouble();
        System.out.println("enter string:");
        String s2= keyboard.nextLine();
//        operations
        int calc1= i+i2;
        double calc2= d+d2;
        String calc3= s+s2;
//        print sum
        System.out.printf("%d\n%.1f\n%s\n", calc1, calc2, calc3);
//
    }
}