package leetcode.ds1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {

		System.out.println(generate(4));
	}

	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> lists = new ArrayList<List<Integer>>(numRows);
		for (int i = 0; i < numRows; i++) {
			List<Integer> list = new ArrayList<>(Collections.nCopies(i + 1, 1));
			// make by default 1 & update the middle values
			for (int j = 1; j < i; j++) { // current row -> i , previous row i-1
				list.add(j, lists.get(i - 1).get(j) + lists.get(i - 1).get(j - 1)); // add values at particular index
				list.remove(list.size() - 1); // remove last element from the list due last step element addition
			}
			lists.add(list);
		}
		return lists;
	}
}
