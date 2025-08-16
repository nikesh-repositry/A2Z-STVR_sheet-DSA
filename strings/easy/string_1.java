//how to create Strings?
package ONE_STRINGS;

public class string_1 {
    public static void main(String[] args) {
        //literal creation
        String str1= "NIKESH";

        //using new keyword
        String str2 = new String("Nikesh");

        //from character array
        char[] str = {'N','i','K','e'};
        String str3 = new String(str); //this line actually creating a String object from the char array

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str);


        //null vs ""
        String str4=""; //empty string with 0 length
        String str5=null; //throws NullPointerException on methods
        System.out.println(str4);
        System.out.println(str5);

        //to check the type of variable
        int x = 5;
        System.out.println(((Object)x).getClass().getName()); // Outputs "java.lang.Integer"

    }
}

