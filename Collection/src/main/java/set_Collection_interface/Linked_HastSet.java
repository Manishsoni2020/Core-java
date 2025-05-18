package set_Collection_interface;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_HastSet {
public static void main(String[]args)
{
	LinkedHashSet<Integer> marks=new LinkedHashSet<>();
	marks.add(25);
	marks.add(null); //only one null value support 
	marks.add(36);
	marks.add(89);
	marks.add(null);
	marks.add(25);
	System.out.println(marks);
	
	marks.remove(25);
	System.out.println(marks);
	
	System.out.println(marks.contains(36));
	
	System.out.println(marks.size());
	
	System.out.println(marks.contains(36));
	
	System.out.println(marks.isEmpty());
	
	Iterator<Integer> itr=marks.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+" ");
	}
	
	marks.clear();
	System.out.println(marks);
}
}
