package DSA.Practice.ex_28Sep;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Palindrome Checker, enter your string");
        String value = input.nextLine();
        int lengthOfvalue = value.length();
        for (int i = 0; i < lengthOfvalue/2 ; i++) {
            if(value.charAt(i) != value.charAt(lengthOfvalue-1-i)) {
                System.out.println("Not a Palindrome");
                return;
            }
        }
        System.out.println("Yes, It is a Palindrome");
    }
}
