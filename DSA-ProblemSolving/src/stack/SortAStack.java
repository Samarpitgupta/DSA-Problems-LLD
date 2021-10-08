package stack;

import java.util.Stack;

public class SortAStack {

	public static void main(String[] args) {

	}

	public Stack<Integer> sort(Stack<Integer> s) {
		// add code here.
		if (!s.isEmpty()) {
			int x = s.pop();
			sort(s);
			insertAtCorrectPosition(s, x);
		}
		return s;
	}

	public static void insertAtCorrectPosition(Stack<Integer> s, int x) {
		if (s.isEmpty() || x > s.peek()) {
			s.push(x);
			return;
		}
		int temp = s.pop();
		insertAtCorrectPosition(s, x);
		s.push(temp);
	}

}
