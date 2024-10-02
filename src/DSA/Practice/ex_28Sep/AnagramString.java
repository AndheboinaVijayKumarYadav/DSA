package DSA.Practice.ex_28Sep;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {

    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] chars = s.toCharArray();
        char[] chars2 = t.toCharArray();


        Arrays.sort(chars);
        Arrays.sort(chars2);

        // Compare sorted arrays
        return Arrays.equals(chars, chars2);
    }
}
