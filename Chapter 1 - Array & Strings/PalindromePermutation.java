import java.util.*;

// Description: Problem 1.4, page 91 of the book

// Problem: Given a string, write a function to check if it is a permutation of a palindrome. A
// palindrome is a word or phrase that is the same forwards and backwards. A permutation is a
// rearrangement of letters. The palindrome does not need to be limited to just dictionary words.

// Note: Wasn't able to fully solve on my own, the source code is:
// https://www.geeksforgeeks.org/check-characters-given-string-can-rearranged-form-palindrome/

public class PalindromePermutation {
	public static boolean formPalindrome(String s) {
		List<Character> ls = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (ls.contains(s.charAt(i))) {
				ls.remove((Character) s.charAt(i));
			} else {
				ls.add(s.charAt(i));
			}
		}

		if (s.length() % 2 == 0 && ls.isEmpty() || (s.length() % 2 == 1 && ls.size() == 1)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		if (formPalindrome("geeksogeeks")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
