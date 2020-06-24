package yikes;
//oli williams
//pseudocode:
//input subtotal
//declare tax and top percentage variables (must be doubles)
//create functions of tax tip and total (also must be doubles)
//system.out.print subtotal tax tip and total on different lines
public class taxtipchallenge {
    public static void main(String[] args) {
        // Calculate total owed, assuming 8% tax / 15% tip
        int subtotal = 38 + 40 + 30;
//        make constant
//        declare variables
        final double TAX=0.08;
        final double TIP=0.15;
//        create functions
        double tax = subtotal * TAX;
        double tip = subtotal * TIP;
        double total = subtotal + tax + tip;
//        print out each function on different lines
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Tax: " + tax);
        System.out.println("Tip: " + tip);
        System.out.println("Total: " + total);
    }
}
