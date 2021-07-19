package arrays.advanced;

public class TrappingRainWater {

	public static void main(String args[]) {
		int a[] = { 3, 0, 1, 2, 5 };
		System.out.println(getWater(a));
		System.out.println(getTrappingWater(a));
	}

	// naive
	// theta n^2
	public static int getWater(int arr[]) {
		int res = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int lMax = arr[i];
			for (int j = 0; j < i; j++)
				lMax = Integer.max(lMax, arr[j]);
			int rMax = arr[i];
			for (int j = 0; j < arr.length; j++)
				rMax = Integer.max(rMax, arr[j]);
			res = res + (Integer.min(lMax, rMax) - arr[i]);
		}
		return res;
	}

	// extra space theta(n) & Theta(n)
	// time theta (n)
	// pre calculate left and right max
	public static int getTrappingWater(int arr[]) {
		int res = 0, n = arr.length;
		int[] lMax = new int[n];
		int rMax[] = new int[n];
		lMax[0] = arr[0];
		rMax[n - 1] = arr[n - 1];
		for (int i = 1; i < n; i++)
			lMax[i] = Integer.max(arr[i], lMax[i - 1]);
		for (int i = n - 2; i >= 0; i--)
			rMax[i] = Integer.max(arr[i], rMax[i + 1]);
		for (int i = 1; i < n - 1; i++)
			res = res + (Integer.min(lMax[i], rMax[i]) - arr[i]);

		return res;
	}
}
