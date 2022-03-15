package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Priority Queue
*/
public class PQMain {

	public static void main(String args[]) {

		Queue<String> pq = new PriorityQueue<>();
		pq.add("ads12");
		pq.add("123");
		pq.add("abc");

		System.out.println(pq.peek());

		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());

//		Queue<Integer> pqi = new PriorityQueue<Integer>(new CustomComparator());
		Queue<Integer> pqi = new PriorityQueue<Integer>(Collections.reverseOrder());
		pqi.add(2);
		pqi.add(3);
		pqi.add(2);
		pqi.add(4);
//		pqi.remove();
		System.out.println("===========");
		// using iterator
		Iterator<Integer> iterator = pqi.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
		System.out.println("==============");
		
		while (!pqi.isEmpty()) {
			System.out.println(pqi.poll());
		}

		System.out.println("Based on OrderID: ");
		CustomerOrder c1 = new CustomerOrder(1, 100.0, "customer1");
		CustomerOrder c2 = new CustomerOrder(3, 50.0, "customer3");
		CustomerOrder c3 = new CustomerOrder(2, 300.0, "customer2");

		Queue<CustomerOrder> customerOrders = new PriorityQueue<>();
		customerOrders.add(c1);
		customerOrders.add(c2);
		customerOrders.add(c3);
		while (!customerOrders.isEmpty()) {
			System.out.println(customerOrders.poll());
		}

	}

	static class CustomComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o1 < o2 ? 1 : -1; // o1 < o2 ? 1 : -1 descending order
			// o1 > o2 ? 1 : -1 ascending order
		}
	}
}

// o.orderId > this.orderId ? 1 : -1 descending order of the orderId
class CustomerOrder implements Comparable<CustomerOrder> {
	private int orderId;
	private double orderAmount;
	private String customerName;

	public CustomerOrder(int orderId, double orderAmount, String customerName) {
		this.orderId = orderId;
		this.orderAmount = orderAmount;
		this.customerName = customerName;
	}

	@Override
	public int compareTo(CustomerOrder o) {
		return o.orderId > this.orderId ? 1 : -1;
	}

	@Override
	public String toString() {
		return "orderId:" + this.orderId + ", orderAmount:" + this.orderAmount + ", customerName:" + customerName;
	}

	public double getOrderAmount() {
		return orderAmount;
	}
}
