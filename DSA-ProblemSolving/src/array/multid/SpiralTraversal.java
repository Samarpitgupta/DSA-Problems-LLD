package array.multid;

public class SpiralTraversal {
	public static void main(String args[]) {
		int arr[][] = { { 1, 2, 4, 5, 6 }, { 7, 8, 9, 19, 20 }, { 10, 12, 14, 15, 16 }, { 17, 20, 21, 22, 23 },
				{ 31, 32, 42, 43, 44 } };
		printSpiralMat(arr, 5, 5);
	}

	public static void printSpiralMat(int[][] mat, int r, int c) { // fix the infinite loop

		int top = 0, bottom = r - 1, left = 0, right = c - 1, dir = 0;
		while (left <= right && top <= bottom) {
			if (dir == 0) {
				for (int i = left; i <= right; i++)
					System.out.print(mat[top][i]);
//					dir = 1;
				top++;
			} else if (dir == 1) {
				for (int i = top; i <= bottom;)
					System.out.print(mat[i][right]);
//					dir = 2;
				right--;
			} else if (dir == 2) {
				for (int i = right; i >= left; i--)
					System.out.print(mat[bottom][i]);
//					dir = 3;
				bottom--;
			} else if (dir == 3) {
				for (int i = bottom; i >= top; i--)
					System.out.print(mat[i][left]);
//					dir = 0;
				left++;
			}
			dir = (dir + 1) % 4;

		}

	}
}
