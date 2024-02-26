package DSA;
//Number of trailing zeroes In a Factorial
import java.util.Scanner;

public class Tomorrow {
    static int trailingZeroes(int n){
        int res=0;
        int powof5 = 5;
        while (n>=powof5){
            res = res+(n/powof5);
            powof5 = powof5 * 5;
        }
        return res;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(trailingZeroes(n));

    }
}
