package yikes;
import java.util.*;
public class challenge3 {
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
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
//        declare original variable
        int i = 4;
        double d = 4.0;
        String s = "Greenhill ";
//         scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Integer:");
        int i2=keyboard.nextInt();
        System.out.println("Double:");
        double d2= keyboard.nextDouble();
        System.out.println("String:");
        String s2= keyboard.nextLine();
//        declare input variable
        i2= scan.nextInt();
        d2=scan.nextDouble();
        s2= scan.nextLine();
        s2= scan.nextLine();
//        operations
        int calc1= i+i2;
        double calc2= d+d2;
        String calc3= s+s2;
//        print sum
        System.out.printf("sum of int variable: \n %20.1f sum of double: \n %20.1f concatenated phrase: 20f", calc1, calc2, calc3);
//        Print the sum of plus your double variable to a scale of one decimal place on a new line.
//        Concatenate with the string you read as input and print the result on a new line.
    }
}