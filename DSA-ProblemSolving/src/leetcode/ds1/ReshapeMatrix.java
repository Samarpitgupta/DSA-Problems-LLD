package leetcode.ds1;

public class ReshapeMatrix {

	public static void main(String[] args) {

	}

	public static int[][] matrixReshape(int[][] mat, int r, int c) {
		int[][] newMat = new int[r][c];
		// check if mat r*c = new mat r*c
		if (mat.length * mat[0].length != r * c) {
			return mat;
		}

		int row = 0;
		int col = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				newMat[row][col] = mat[i][j];
				col++;
				if (col == c) { // if col reach to end -> increase row and make col to first col index(0)
					row++;
					col = 0;
				}
			}
		}
		return newMat;
	}
}
