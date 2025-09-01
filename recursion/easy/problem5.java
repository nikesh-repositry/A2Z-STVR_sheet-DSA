//---------------EASY
//find the power of the number
package TWO_RECURSION;
import java.util.*;
class power{
    public static int num(int a, int b){
        if(b==0){
            return 1;
        }
        return a*num(a,b-1);
    }
}
public class problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter base= ");
        int aa = input.nextInt();
        System.out.println("enter power= ");
        int bb = input.nextInt();
        System.out.println(power.num(aa,bb));
    }
}
