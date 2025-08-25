//print all the substring of a given string
package ONE_STRINGS;
import java.util.Scanner;
public class problem_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the string please:  ");
        String s = input.nextLine();
        System.out.println("String length is:  "+s.length());
        int count = 0;
        for(int i = 0; i<s.length();i++){
            for(int j = i+1; j<=s.length();j++){
                System.out.print(s.substring(i,j)+" ");
                count+=1;
            }
//            System.out.println();   if this execute then a pattern of name will be printed
        }
        System.out.println();
        System.out.print("total no of substring is "+count);
    }
}
