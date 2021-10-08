package arrays.advanced;

public class RightmostNonZeroDigit {
	public static void main(String args[]) {
		System.out.println(rightmostNonZeroDigit(4, new int[] { 3, 23, 30, 440 }));
	}

	static int rightmostNonZeroDigit(int N, int[] A) {
		// code here
		int product = 1;
		for (int i = 0; i < N; i++) {
			product = product * A[i];
		}
		System.out.println(product + " product");
		int element = product;
		while (product > 0) {
			element = product % 10;
			if (element != 0) {
				System.out.println("final " + element);
				return element;
			} else
				product = product / 10;
		}
		return -1;
	}
}
