package leetcode.ds1;

public class ReverseString {

	public static void main(String[] args) {
	}

	public static void reverseString(char[] s) {

		int start = 0, end = s.length - 1;

		while (start < end) {
			char tempC = s[start];
			s[start] = s[end];
			s[end] = tempC;

			start++;
			end--;
		}

	}

}
