//-----------EASY
//reverse the string using recursion
package TWO_RECURSION;
import java.util.*;
class recursion{
    public static String str(String s){
        if(s.length()==0){
            return "";
        }
//        if(s.isEmpty()){          commented lines are alternate logic and it works
//            return s;
//        }
//        return s.substring((s.length()-1),(s.length()))+str(s.substring(0,s.length()-1));
        return str(s.substring(1))+s.charAt(0);
    }
}

public class problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string ");
        String ss = input.nextLine();
        System.out.println(recursion.str(ss));
    }
}
