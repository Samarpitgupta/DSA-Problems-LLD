class MedianFinder {

    // Intuition:
    // - The max-heap stores the smaller half of the numbers, ensuring the largest number in this half is at the root.
    // - The min-heap stores the larger half of the numbers, ensuring the smallest number in this half is at the root.
    // - By balancing the heaps, we ensure that the roots of these heaps give us the median.

    private PriorityQueue<Integer> minHeap;

    private PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
        maxHeap = new PriorityQueue<>((a, b) -> b - a);
        minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        // Add to max-heap first
        maxHeap.offer(num);
        // Balance the heaps by moving the largest element of max-heap to min-heap
        minHeap.offer(maxHeap.poll());
        // Ensure max-heap has the same number or one more element than min-heap
        if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        } else {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */