//string methods?
package ONE_STRINGS;


import java.util.Arrays;

public class string_2 {
    public static void main(String[] args) {
        String a="NIKESH";
        String b ="KUMAR";
        String c =new String("NIKESH");
        String d ="Banana";
        //A.basic string methods
        //1.length()=return length of string
        System.out.println("A.1. length    "+a.length());
        //2.chatAt()=return character at any position
        System.out.println("A.2. chatAt    "+a.charAt(3));
        //3.isEmpty()=return yes if string is empty else false
        System.out.println("A.3. isEmpty    "+a.isEmpty());



        //B.comparison
        //4.equals()=compares the sequence of characters in two string
        System.out.println("B.4. equals    "+a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a==b);
        System.out.println(a==c);
        //5.indexOf()=finds the first occurrence of a given substring and return -1 if not found and it is case sensitive
        System.out.println("B.5. indexof    "+a.indexOf("KE"));
        //6.lastIndexOf()=find the last occurrence of a given substring and return -1 if not found
        System.out.println("B.6. lastIndexOf    "+d.lastIndexOf("na"));



        //C.modification and manipulation
        //5.concat()=used to concate two strings
        System.out.println("C.7. concat    "+a.concat(b));
        //6.substring()=this is used in two ways one from given index to end and another from start to end(end is not inlcluded)
        System.out.println("C.8. substring    "+a.substring(2));
        System.out.println(a.substring(2,3));
        //7.replace()=it is case sensitive and it used to replace old char and sequence to new one
        System.out.println("C.7. replace    "+a.replace("KESH","KKU"));
        //8.trim()=it used to remove leading and trailing whitespace but not in between space
        System.out.println("C.8. trim    "+" jav a  ".trim());
        //9.toLowerCase()=it is used to convert text into lower case
        System.out.println("C.9. toLowerCase    "+a.toLowerCase());
        //10.toUpperCase()=it is used to convert text into upper case
        System.out.println("C.10. toUpperCase    "+d.toUpperCase());
        //11.split()= a powerful tool for breaking a string into parts based on a delimiter
        //without using Arrays.toString it will only output the reference of the array not readable value
        String e = "a,b,c,d";
        System.out.println("C.11. split    "+ Arrays.toString(e.split(",")));
        //12.join()=used to join multiple strings using a delimiter between them
        System.out.println("C.12. join    "+String.join(" and ",a,b));



        //D.CONVERSION
        //13.toCharArray()=converts a string into a character array
        System.out.println("D.13. toCharArray");
        char[] letters = a.toCharArray();
        for(char i:letters){
            System.out.println(i);
        }
        //14.getBytes()=
        System.out.println("D.14. getBytes");
        byte[] bytes = a.getBytes();
        for(byte i:bytes){
            System.out.println(i);
        }
        //15.valueOf()=
        int num = 55652;
        String kk = String.valueOf(num);
        System.out.println(num);
        System.out.println("D.15. valueOf    "+String.valueOf(num));

    }
}
