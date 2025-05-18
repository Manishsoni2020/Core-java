package set_Collection_interface;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Set {
public static void main(String[]args)
{
	TreeSet<Float> number=new TreeSet<>();
	number.add(50f);
	number.add(85f);
	number.add(69f);
	number.add(73.36f);
	number.add(31f);
	number.add(69f); //duplicate value
	number.add(92f);
	System.out.println(number);
	
//	System.out.println(number.isEmpty());
//	System.out.println(number.size());
//	System.out.println(number.contains(69.0f));
//	
//	System.out.println(number.first());
//	System.out.println(number.last());
	
	System.out.println(number.higher(30.2f));
	System.out.println(number.lower(30.2f));
	System.out.println(number.ceiling(30.02f));
	System.out.println(number.floor(30.02f));
	
	System.out.println(number.headSet(90f)); //lessthen 90
	System.out.println(number.tailSet(50f)); //greaterthen 50
	System.out.println(number.subSet(20f, 80f)); //range between 20, 80
	
	Iterator<Float> itr=number.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+" ");
	}
	
	number.clear();
	System.out.println(number);
}
}
