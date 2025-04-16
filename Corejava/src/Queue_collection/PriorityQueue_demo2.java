package Queue_collection;

import java.util.*;

class MyComparator implements Comparator
{
	

	public int compare(Object o1,Object o2)
	{
		String s1=(String)o1;
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
}

public class PriorityQueue_demo2 {
public static void main(String[] args) {
	PriorityQueue q =new PriorityQueue();
	q.offer("A");
	q.offer("Z");
	q.offer("L");
	q.offer("B");
	System.out.println(q);
}
}
