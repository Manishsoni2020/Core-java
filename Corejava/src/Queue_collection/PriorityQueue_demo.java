package Queue_collection;

import java.util.*;
public class PriorityQueue_demo {
public static void main(String[] args) {
	PriorityQueue q =new PriorityQueue();
	for(int i=1;i<=10;i++)
	{
		q.offer(i);
	}
	System.out.println(q);
	System.out.println(q.poll());
	System.out.println();
}
}
