package Strings;

public class Palindrome {

    static boolean isPalindrome(String str) {
        for(int i=0; i<= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if(start != end) {
                return false;
            }


        }
        return true;
    }
    public static void main(String[] args) {
        // it means char from beg is same at starts with end "abcdcba"
        String str = "abcdcba";
        System.out.println(isPalindrome(str));

    }
}
