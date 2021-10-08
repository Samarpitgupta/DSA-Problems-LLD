package gfg100days.challenge.day1to10;

import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String args[]) {

	}

	// Function to check if brackets are balanced or not.
	static boolean ispar(String x) {
		// add your code here
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == '{' || x.charAt(i) == '(' || x.charAt(i) == '[') {
				stack.push(x.charAt(i));
			} else if (x.charAt(i) == '}') {
				if (!stack.isEmpty() && stack.peek() == '{')
					stack.pop();
				else
					return false;
			} else if (x.charAt(i) == ']') {
				if (!stack.isEmpty() && stack.peek() == '[')
					stack.pop();
				else
					return false;
			} else if (x.charAt(i) == ')') {
				if (!stack.isEmpty() && stack.peek() == '(')
					stack.pop();
				else
					return false;
			}
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
	}
}
