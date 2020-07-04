import java.util.*;
import java.util.stream.*;

public class Palindrome {
    public static void checkPalindrome(List<String> list) {
        Stream<String> stream = list.stream();
        long palindrome = stream.filter(Palindrome::isPalindrome)// find all palindromes
                .peek(System.out::println) // write each match
                .count();// terminal - return a count
        System.out.println("Count of palindromes: " + palindrome);
    }
    private static boolean isPalindrome(String aa) {

        return new StringBuffer(aa).reverse().toString().equals(aa);

    }
}
