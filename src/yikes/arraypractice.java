package yikes;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class arraypractice {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("How many day's temperatures?: ");
        int days = input.nextInt();
        int [] temperatures = new int [days];
        int sum=0;
        Random number = new Random ();

        for (int i= 0; i<days; i++){
            temperatures [i]=number.nextInt(85)+25;
            System.out.println("Day"+ (i+1)+"'s high temp: "+ temperatures[i]);
            sum += temperatures[i];
        }
        Double average = (double) sum/days;
        int count = 0;
        for (int i=0; i< days; i++){
            if (temperatures[i] > average){
                count++;
            }
        }
        System.out.print("There were "+ count+" days above average");
    }
}
//create for loop
//7 random elements