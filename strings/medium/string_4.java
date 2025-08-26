//program to understand basic stringbuilder methods
package ONE_STRINGS;

public class string_4 {
    public static void main(String[] args) {
        //key constructors to make stringbuilder
        //1. default constructor: initial capacity of 16
        StringBuilder sb1 = new StringBuilder();
        //2. specify initial capacity
        StringBuilder sb2 = new StringBuilder();
        //3. initialize with a String
        StringBuilder sb3 = new StringBuilder();

        //key methods of stringbuilder

        //append
        sb1.append("area");//add data to the end
        sb1.append(51);
        System.out.println(sb1);

        //insert
        sb1.insert(4," under ");//insert dat at a specific index
        System.out.println(sb1);

        //delete
        sb1.delete(4,11);//remove characters from index 4 to 10
        System.out.println(sb1);

        //replace
        sb1.replace(4,6,"50");//replace characters from 4 to 5
        System.out.println(sb1);
        sb1.replace(0,4,"number");//not necessary to match the length from start to end index
        System.out.println(sb1);

        //reverse
        sb1.reverse();
        System.out.println(sb1);
    }
}

