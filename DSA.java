//Java program to count the Number of digits
package FullDsa;
import java.util.Scanner;
public class DSA {
    static int countDigit(int n){
        int count=0;
        while (n>0) {
            n = n / 10;
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            System.out.println(countDigit(n));
        }catch(Exception e){
            System.out.println("Some Thing went wrong");
        }
    }

}
