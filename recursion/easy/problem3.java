//------------EASY
//find the sum of the first n natural number
package TWO_RECURSION;
import java.util.*;
class number{
    public static int num(int n){
        if(n==0){
            return 0;
        }
        return n+num(n-1);
    }
}

public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number to get additon= ");
        int a = input.nextInt();
        System.out.println("here is the addition "+number.num(a));
    }
}
