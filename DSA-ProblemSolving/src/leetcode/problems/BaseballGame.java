package leetcode.problems;

import java.util.Stack;

public class BaseballGame {

	public static void main(String[] args) {
	}

	class Solution {
		public int calPoints(String[] ops) {
			Stack<Integer> stack = new Stack<>();

			for (String op : ops) {
				if (op.equals("+")) {
					int top = stack.pop();
					int top2 = top + stack.peek();
					stack.push(top); //
					stack.push(top2); //
				} else if (op.equals("C")) {
					stack.pop();
				} else if (op.equals("D")) {
					stack.push(2 * stack.peek());
				} else {
					stack.push(Integer.valueOf(op));
				}
			}
			int res = 0;
			for (int score : stack)
				res += score;
			return res;
		}
	}

}
