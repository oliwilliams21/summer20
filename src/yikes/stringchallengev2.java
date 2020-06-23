package yikes;
import java.util.*;
public class stringchallengev2 {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int t;
            t=scan.nextInt();
            while(t>0) {
                String str=scan.next();
                for(int i=0;i<str.length();i++) {
                    if(i%2==0) {
                        System.out.print(str.charAt(i));
                    }
                }
                System.out.print(" ");
                for(int i=0;i<str.length();i++) {
                    if(i%2==1) {
                        System.out.print(str.charAt(i));
                    }
                }
                t=t-1;
                System.out.println();
            }
        }
    }
