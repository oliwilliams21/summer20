package yikes;
import java.util.Arrays;

public class reversenumbers {
    public static void main(String[] args){
        int [] numbers = {30, 4, 9, 23, 65, 12, 87, 1};
        numbers = reverse(numbers);
       System.out.print(Arrays.toString(numbers));
    }
    public static int [] reverse (int [] num ){ //reverses the order of the numbers
        for (int i = 0; i<num.length/2; i++){
            int temp = num[i];
            num[i]= num[num.length-1-i];
            num[num.length-1-i]=temp;
        }
        return num;
    }
}