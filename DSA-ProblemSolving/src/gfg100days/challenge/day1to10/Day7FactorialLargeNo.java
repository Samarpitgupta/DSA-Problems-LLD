package gfg100days.challenge.day1to10;

import java.util.ArrayList;

public class Day7FactorialLargeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static ArrayList<Integer> factorial(int N) {
		// code here
		ArrayList<Integer> result = new ArrayList<>();
		int size = 0, carry = 0;
		result.add(0, 1);
		size = 1;
		// variable to traverse numbers from 2 to n
		int val = 2;
		while (val <= N) {
			// traverse list from right to left
			for (int i = size - 1; i >= 0; i--) {
				// update value in list
				int temp = result.get(i) * val + carry;
				// store the last digit at index and add remaining to carry
				result.set(i, temp%10);
				// update carry
				carry=temp/10;
			}
			// insert carry digit by digit to the beginning of the list
			while(carry!=0) {
				result.add(0, carry%10);
				carry=carry/10;
				size++;
			}
			val++;
		}
		return result;
	}
}
