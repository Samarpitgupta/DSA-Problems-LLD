package arrays.advanced;

public class FrequenciesSortedArray {

	public static void main(String args[]) {
		int a[] = { 2, 4, 6, 7, 8, 8, 9, 9, 9, 10 };
		frequenciesSortedArray(a);
	}

	public static void frequenciesSortedArray(int[] arr) { // check corner cases

		int freq = 1, i = 1, n = arr.length;
		while (i < n) {
			while (i < n && arr[i] == arr[i - 1]) {
				freq++;
				i++;
			}
			System.out.println(arr[i - 1] + " " + freq);
			i++;
			freq = 1;
		}

		if (n == 1 || arr[n - 1] != arr[n - 2]) {
			System.out.println(arr[i - 1] + " " + 1);
		}

	}

}
