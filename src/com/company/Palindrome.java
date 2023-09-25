package com.company;

public class Palindrome {
    public static boolean findPalindrome(String text) {
        return text.trim().equals(new StringBuilder(text.trim()).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(findPalindrome(" радар"));
        System.out.println(findPalindrome("level"));
        System.out.println(findPalindrome("next"));
        System.out.println(findPalindrome("noname"));
    }
}