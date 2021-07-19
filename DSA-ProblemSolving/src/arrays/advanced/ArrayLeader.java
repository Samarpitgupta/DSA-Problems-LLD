package arrays.advanced;

public class ArrayLeader {

	public static void main(String args[]) {

		int a[] = { 2, 4, 6, 7, 1, 2, 4, 5 };
		arrayLeader(a);
		arrLeader(a);
	}

	// Leaders in an Array problem
	// An element is called the leader of an array if there is no element greater
	// than it on the right side.

	// Naive
	// O (n^2)
	public static void arrayLeader(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] <= arr[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false)
				System.out.println(arr[i]);
		}
	}

	// O(n)
	// print from back
	public static void arrLeader(int arr[]) {
		int n = arr.length;
		int currLeader = arr[n - 1];
		System.out.println(currLeader);
		for (int i = n - 2; i >= 0; i--) {
			if (currLeader < arr[i]) {
				currLeader = arr[i];
				System.out.println(currLeader);
			}
		}
	}
}
