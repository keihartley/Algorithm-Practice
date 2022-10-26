import java.util.*;

// Description: Problem 1.1, page 90 of the book
// Problem: Implement an algorithm to determine if a string has all unique characters. What if you
// cannot use additional data structures?
public class IsUnique extends Tools {
    public static void main(String[] args) {
        // Tools
        Tools tools = new Tools();
        Scanner reader = new Scanner(System.in);

        // First word
        System.out.print("Enter a word: ");
        String word = reader.next();
        while (!tools.onlyChar(word.toLowerCase())) {
            System.out.print("Word contains numbers, please re-enter without: ");
            word = reader.next();
        }

        // Checking if all characters are unique
        if (tools.allUnique(word.toLowerCase())) {
            System.out.println("The word, " + word + " has all unique characters");
        } else {
            System.out.println("The word, " + word + " has reoccuring characters");
        }
        reader.close();
    }
}
