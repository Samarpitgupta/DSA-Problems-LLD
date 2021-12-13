package leetcode.ds1;

public class Search2DMat {

	public static void main(String[] args) {

	}

	public static boolean searchMatrix(int[][] matrix, int target) {

		int i = 0, j = matrix[0].length - 1;

		while (i < matrix.length && j >= 0) {
			if (target == matrix[i][j]) {
				return true;
			} else if (target < matrix[i][j]) {
				j--;
			} else
				i++;
		}
		return false;
	}
}
