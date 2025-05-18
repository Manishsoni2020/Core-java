package listCollectionInterface;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector_demo {
public static void main(String[]args)
{
	Vector<String> fruits = new Vector<>();
	fruits.add("Mango");
	fruits.add("Banana");
	fruits.add("Coconut");
	fruits.add("Papaya");
	System.out.println(fruits);
	
	fruits.add(2, "Grapes");
	System.out.println(fruits);
	
	fruits.remove("Coconut");
	fruits.remove(3);
	System.out.println(fruits);
	
	System.out.println(fruits.get(2));
	System.out.println(fruits.size());
	System.out.println(fruits.capacity());
	
	Enumeration<String> enm=fruits.elements();
	while(enm.hasMoreElements())
	{
		System.out.print(enm.nextElement()+" ");
	}
	
	System.out.println();
	
	Iterator<String> itr=fruits.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+" ");
	}
}
}
