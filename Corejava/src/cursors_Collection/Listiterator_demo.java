package cursors_Collection;

import java.util.*;
public class Listiterator_demo {
public static void main(String[] args) {
	LinkedList ll=new LinkedList();
	ll.add("cow");
	ll.add("lion");
	ll.add("peacock");
	ll.add("crow");
	System.out.println(ll);
	ListIterator lt=ll.listIterator();
	while(lt.hasNext())
	{
		String s=(String)lt.next();
		if(s.equals("peacock"))
		{
			lt.remove();
		}
		if(s.equals("cow"))
		{
			lt.set("cat");
		}
		if(s.equals("lion"))
		{
			lt.add("dog");
		}
	}
	System.out.println(ll);
}
}
