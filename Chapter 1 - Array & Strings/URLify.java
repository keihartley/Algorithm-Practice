import java.util.*;

// Description: Problem 1.2, page 90 of the book

// Problem: Write a method to replace all spaces in a string with '%20'. You may assume that the
// string has sufficient space at the end to hold the additional characters, and that you are given
// the "true" length of the string. (Note: If implementing in Java, please use a character array so
// that you can perform this operation in place.)

public class URLify extends Tools {
    public static void main(String[] args) {
        // Example inputs
        char[] words = "Mr John Smith    ".toCharArray();
        int trueLength = 13;
        StringBuilder edited = new StringBuilder();
        for (int i = 0; i < trueLength; i++) {
            if (words[i] != ' ') {
                edited.append(words[i]);
            } else {
                edited.append("%20");
            }
        }
        System.out.println(edited.toString());
    }
}