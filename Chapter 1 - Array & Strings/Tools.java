// Imports
import java.util.*;

// Methods utilized in the chapter
public class Tools {

    // Purpose: Check whether a string only contains characters
    // Input: String
    // Output: Boolean
    public boolean onlyChar(String s) {
        for (char ch : s.toCharArray()) {
            if (!Character.isLetter(ch)) {
                return false;
            }
        }
        return true;
    }

    // Purpose: Creating a sorted char array from a string
    // Input: String
    // Output: Char array
    public char[] toSortedChars(String s) {
        char chars[] = s.toCharArray();
        Arrays.sort(chars);
        return chars;
    }

    // Purpose: Checking whether every character in a string is unique
    // Input: String
    // Output: Boolean
    public boolean allUnique(String s) {
        char[] chars = toSortedChars(s);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Purpose: Checking if the two strings are permutations by sorting and
    // comparing each character
    // Input: Two strings
    // Output: Boolean
    public boolean isPermutation(String first, String second) {
        char[] firstChars = toSortedChars(first);
        char[] secondChars = toSortedChars(second);

        if (firstChars.length != secondChars.length) {
            return false;
        } else {
            for (int i = 0; i < firstChars.length; i++) {
                if (firstChars[i] != secondChars[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}