package arrays.advanced;

public class ConsecutiveOnesBinaryArray {

	public static void main(String args[]) {

		boolean arr[] = { false, true, true, true, false, true, true };
		System.out.println(consecutiveOnes(arr));
		System.out.println(consecutive1s(arr));
	}

	// naive
	// time O(n2)
	// aux O(1)
	public static int consecutiveOnes(boolean arr[]) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			int curr = 0;
			for (int j = i; j < arr.length - 1; j++) {
				if (arr[j] == true)
					curr++;
				else
					break;
			}
			res = Integer.max(res, curr);
		}
		return res;
	}

	// O(n)
	public static int consecutive1s(boolean arr[]) {
		int res = 0;
		int curr = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == false) {
				curr = 0;
			} else {
				curr++;
				res = Integer.max(res, curr);
			}
		}
		return res;
	}
}
