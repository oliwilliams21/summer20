package yikes;
import java.util.Scanner;

public class challenge4 {
    public static void main(String[] args) {
        System.out.println("This perogram reads data for two people and computes their body mass index (BMI)");
        System.out.println("Enter next person's information");
        Scanner input = new Scanner(System.in);
        System.out.println("Height (in.)");
        Double firstheight = input.nextDouble();
        System.out.println("Weight (lbs.):");
        Double firstweight = input.nextDouble();
        System.out.println("Enter second person's information:");
        System.out.println("Height (in.)");
        Double secondheight = input.nextDouble();
        System.out.println("Weight (lbs.):");
        Double secondweight = input.nextDouble();
//        operations
        Double bmi1 = (firstweight/(Math.pow(firstheight,2)))*703;
        Double bmi2 = (secondweight/Math.pow(secondheight,2))*703;
//        print sum
        System.out.println("Person 1 BMI:" + bmi1);
        if (bmi1>=30){
            System.out.println("Obese");
        } else if (bmi1>25.0){
            System.out.println("Overweight");
        } else if (bmi1>18.5){
            System.out.println("Normal");
        } else if (bmi1<18.5) {
            System.out.print("Underweight");
        }
        System.out.println("Person 2 BMI:" +bmi2);
        if (bmi2>=30){
            System.out.println("Obese");
        } else if (bmi2>25.0){
            System.out.println("Overweight");
        } else if (bmi2>18.5){
            System.out.println("Normal");
        } else if (bmi2<18.5) {
            System.out.print("Underweight");
        }
        System.out.println("Difference: "+ (bmi1-bmi2));
    }
}