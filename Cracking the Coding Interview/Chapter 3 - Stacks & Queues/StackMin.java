import java.util.Stack;

// Description

// Problem: How would you design a stack which, in addition to push and pop, has a function min
// which returns the minimum element? Push, pop, and min should all operate in O(1) time.

public class StackMin extends Stack<NodeMin> {
	public void push(int value) {
		int minVal = Math.min(value, min());
		super.push(new NodeMin(value, minVal));
	}

	public int min() {
		if (this.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return peek().min;
		}
	}
}

class NodeMin {
	public int value;
	public int min;
	public NodeMin(int v, int min) {
		value = v;
		this.min = min;
	}
}
