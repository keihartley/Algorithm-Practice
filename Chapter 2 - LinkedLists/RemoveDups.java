import java.util.*;

// Description: Problem 2.1, page 94 of the book

// Problem: Write code to remove duplicates from an unsorted linked list

class RemoveDups {
	void deleteDups(LinkedListNode n) {
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedListNode previous = null;
		while (n != null) {
			if (set.contains(n.data)) {
				previous.next = n.next;
			} else {
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}
}
