package ONE_STRINGS;

public class string_3 {
    public static void main(String[] args) {
        String s1 = "hello";              // Literal, interned automatically
        String s2 = "hello";              // Same reference as s1
        String s3 = new String("hello");   // New object in heap, not interned
        String s4 = s3.intern();          // Refers to "hello" in String Pool

        System.out.println(s1 == s2);     // true (both point to String Pool)
        System.out.println(s1 == s3);     // false (s3 is in heap)
        System.out.println(s1 == s4);     // true (s4 is interned, points to String Pool)
        System.out.println(s1.equals(s3)); // true (same content)
    }
}
