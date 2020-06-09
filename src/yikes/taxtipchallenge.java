package yikes;
public class taxtipchallenge {
    public static void main(String[] args) {
        // Calculate total owed, assuming 8% tax / 15% tip
        int subtotal = 38 + 40 + 30;
//        make constant
        final double TAX=0.08;
        final double TIP=0.15;
        double tax = subtotal * TAX;
        double tip = subtotal * TIP;
        double total = subtotal + tax + tip;
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Tax: " + tax);
        System.out.println("Tip: " + tip);
        System.out.println("Total: " + total);
    }
}
