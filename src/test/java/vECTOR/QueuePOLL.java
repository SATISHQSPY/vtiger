package vECTOR;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePOLL {
public static void main(String[] args) {
	Queue q = new LinkedList<>();
	q.offer(65);
	q.offer(12);
	q.offer(45);
	q.offer(52);
	q.offer(4);
	System.out.println(q);
	while (!q.isEmpty())
	{
		System.out.println(q.poll());
	}
System.out.println(q);
}
}
