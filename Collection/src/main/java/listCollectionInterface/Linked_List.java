package listCollectionInterface;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {
public static void main(String[]args)
{
	LinkedList<String> ll=new LinkedList<>();
	ll.add("Dog");
	ll.add("Cow");
	ll.add("Horse");
	System.out.println(ll);
	
	ll.addFirst("Tiger");
	ll.addLast("Cat");
	
	System.out.println(ll);
	
	ll.removeFirst();
	ll.removeLast();
	ll.remove("Cow");
	
	System.out.println(ll);
	
	ll.set(1, "Lion");
	System.out.println(ll);
	
	Iterator<String> itr=ll.iterator();
	while(itr.hasNext())
	{
		String animalName=itr.next();
		System.out.println(animalName);
	}
}
}
