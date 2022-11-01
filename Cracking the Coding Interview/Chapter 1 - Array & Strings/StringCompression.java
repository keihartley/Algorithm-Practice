// Description: Problem 1.5, page 91 of the book

// Problem: Implement a method to perform basic string compression using the counts of repeated
// characters. For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string
// would not become smaller than the original string, your method should return the original string.
// You can assume the string has only uppercase and lowercase letters. (a - z)

public class StringCompression {
	public static String compress(String s) {
		StringBuilder compressed = new StringBuilder();
		int consecutive = 0;
		for (int i = 0; i < s.length(); i++) {
			consecutive++;
			if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
				compressed.append(s.charAt(i));
				compressed.append(consecutive);
				consecutive = 0;
			}
		}
		return compressed.length() < s.length() ? compressed.toString() : s;
	}
	public static void main(String[] args) {
		String question = "aabcccccaaa";
		System.out.println(compress(question));
	}
}
