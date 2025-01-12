class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] result = new int[n];

        // Step 1: Store intervals along with their original indices
        int[][] indexedIntervals = new int[n][3];
        for (int i = 0; i < n; i++) {
            indexedIntervals[i][0] = intervals[i][0]; // start
            indexedIntervals[i][1] = intervals[i][1]; // end
            indexedIntervals[i][2] = i; // original index
        }

        // Step 2: Sort intervals by start time
        Arrays.sort(indexedIntervals, Comparator.comparingInt(a -> a[0]));

        // Step 3: Binary search for each interval's right interval
        for (int i = 0; i < n; i++) {
            int end = indexedIntervals[i][1];
            int idx = binarySearch(indexedIntervals, end);
            result[indexedIntervals[i][2]] = idx;
        }

        return result;
    }

    // Binary search to find the smallest start >= target
    private int binarySearch(int[][] intervals, int target) {
        int left = 0, right = intervals.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (intervals[mid][0] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // If left is out of bounds, no valid interval exists
        return left < intervals.length ? intervals[left][2] : -1;
    }
}