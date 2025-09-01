//---------------EASY
//find the nth fibonacci number starting from 0,1
package TWO_RECURSION;
import java.util.*;
class fibonacci{
    public static int fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}

public class problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number ");
        int a = input.nextInt();
        int b = fibonacci.fibo(a);
        System.out.println("the fibonacci will be "+b);
    }
}
