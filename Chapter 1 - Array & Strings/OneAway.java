import java.util.*;

// Description: Problem 1.5, page 91 of the book

// Problem: There are three types of edits that can be performed on strings: insert a character,
// remove a character, or replace a character. Given two strings, write a function to check if they
// are one edit (or zero edits) away.

// Example
// pale, ple -> true
// pales, pale -> true
// pale, bale -> true
// pale, bake -> false

// Note: Still in progress, output not correct

public class OneAway {
	public static boolean check(String q1, String q2) {
		if (q1.length() == q2.length()) {
			return replace(q1, q2);
		} else if (q1.length() + 1 == q2.length()) {
			return insert(q1, q2);
		} else if (q1.length() - 1 == q2.length()) {
			return insert(q2, q1);
		}
		return false;
	}

	public static boolean insert(String q1, String q2) {
		boolean diff = false;
		for (int i = 0; i < q1.length(); i++) {
			if (q1.charAt(i) != q2.charAt(i)) {
				if (diff) {
					return false;
				}
				diff = true;
			}
		}
		return true;
	}

	public static boolean replace(String q1, String q2) {
		int index1 = 0;
		int index2 = 0;
		while (index2 < q2.length() && index1 < q1.length()) {
			if (q1.charAt(index1) != q2.charAt(index2)) {
				if (index1 != index2) {
					return false;
				}
				index2++;
			} else {
				index1++;
				index2++;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String questionOnePre = "pale";
		String questionOnePost = "bake";
		System.out.println(check(questionOnePre, questionOnePost));
	}
}
