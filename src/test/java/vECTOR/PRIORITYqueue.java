package vECTOR;

import java.util.PriorityQueue;
import java.util.Queue;

public class PRIORITYqueue {
public static void main(String[] args) {
	Queue q = new PriorityQueue();
	q.offer(65);
	q.offer(12);
	q.offer(12);
	q.offer(25);
	System.out.println(q);
	while (!q.isEmpty())//insertion type poll request
	{
		System.out.println(q.poll());
	}
}
}
