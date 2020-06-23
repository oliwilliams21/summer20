package yikes;
import java.util.Arrays;
import java.util.Random;
//oli williams
public class arrayparameters {
    public static void main(String[] args){
        Random number = new Random ();
        int size = number.nextInt(5)+5;
        System.out.println("you will have "+ size + " random numbers");
        int [] a1 = new int [size];

        for ( int i=0; i<size; i++){
            a1 [i]= number.nextInt(100);
        }
        System.out.println(Arrays.toString(a1));
        int index1 = number.nextInt(size);
        int index2 = number.nextInt(size);
        swap(a1, index1, index2);
        System.out.println(Arrays.toString(a1));
    }
    public static int[] swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
        return a;
    }
}