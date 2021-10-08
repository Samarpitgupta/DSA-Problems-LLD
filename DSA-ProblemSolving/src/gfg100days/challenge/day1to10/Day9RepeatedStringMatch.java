package gfg100days.challenge.day1to10;

public class Day9RepeatedStringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Given two strings A and B, find the minimum number of times A has to be
	// repeated such that B becomes a substring of the repeated A. If B cannot be a
	// substring of A no matter how many times it is repeated, return -1.
	static int repeatedStringMatch(String A, String B) {
		String strA = A;
		int repeat = B.length() / A.length();
		int count = 1;

		for (int i = 0; i < repeat + 2; i++) {
			if (A.contains(B))
				return count;
			else {
				A = A + strA;
				count++;
			}
		}
		return -1;
	}
}
