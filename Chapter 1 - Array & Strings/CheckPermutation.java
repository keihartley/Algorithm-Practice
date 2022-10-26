import java.util.*;

// Description: Problem 1.2, page 90 of the book
// Problem: Given two strings, write a method to decide if one is a permutation of the other.
public class CheckPermutation extends Tools {
    public static void main(String[] args) {
        // Tools
        Tools tools = new Tools();
        Scanner reader = new Scanner(System.in);

        // First String
        System.out.print("Enter a string: ");
        String firstWord = reader.next();
        while (!tools.onlyChar(firstWord.toLowerCase())) {
            System.out.print("The word " + firstWord
                    + " contains something other than letters, please enter again: ");
            firstWord = reader.next();
        }

        // Second String
        System.out.print("Enter a second string: ");
        String secondWord = reader.next();
        while (!tools.onlyChar(secondWord.toLowerCase())) {
            System.out.print("The word " + secondWord
                    + " contains something other than letters, please enter again: ");
            secondWord = reader.next();
        }

        // Check Permutation
        if (tools.isPermutation(firstWord.toLowerCase(), secondWord.toLowerCase())) {
            System.out.println("The two provided words, " + firstWord + " & " + secondWord
                    + ", is a permutation");
        } else {
            System.out.println("The two provided words, " + firstWord + " & " + secondWord
                    + ", is not a permutation");
        }
        reader.close();
    }
}
