//-------------EASY
//find the factorial of non negative numbers
package TWO_RECURSION;
import java.util.*;
class factorial{
    public static long fact(long n){
        if(n==0||n==1){
            return 1;
        }
        return n*fact(n-1);
    }

}
public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number = ");
        long a = input.nextLong();
        long b = factorial.fact(a);
        System.out.println("the factorial of the number is "+b);
    }
}
