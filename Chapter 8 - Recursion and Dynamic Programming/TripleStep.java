// Description: Problem 8.1, page 134 of the book

// Problem: A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3
// steps at a time. Implement a method to count how many possible ways the child can run up the
// stairs.

// Brute force
class TripleStep {
	static int countPossibilities(int n) {
		if (n < 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		} else {
			return countPossibilities(n - 1) + countPossibilities(n - 2) + countPossibilities(n - 3);
		}
	}

	public static void main(String[] args) {
		System.out.println(countPossibilities(10));
	}
}