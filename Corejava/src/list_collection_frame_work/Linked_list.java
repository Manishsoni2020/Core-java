package list_collection_frame_work;

import java.util.*;
public class Linked_list {
	public static void main(String []args)
	{
		LinkedList ll=new LinkedList();
		ll.add("durga");
		ll.add(30);
		ll.add(null);
		ll.add(30);
		System.out.println(ll);
		ll.set(1, "software");
		ll.add(0, "manish");
		System.out.println(ll);
		ll.removeLast();
		ll.addFirst(55);
		System.out.println(ll);
	}
}
