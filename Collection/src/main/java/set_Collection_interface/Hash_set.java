package set_Collection_interface;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {
public static void main(String[]args)
{
	HashSet<String> states=new HashSet<>();
	states.add("Rajasthan");
	states.add("Uttar Pradesh");
	states.add(null);
	states.add("Gujrat");
	states.add("Assam");
	states.add(null);
	states.add("Gujrat");
	System.out.println(states);
	
	states.remove(null);
	states.remove("Assam");
	System.out.println(states);
	
	System.out.println(states.contains("Maharashtra"));
	System.out.println(states.contains("Rajasthan"));
	
	System.out.println(states.isEmpty());
	
	System.out.println(states.size());
	
	//for each loop for printing
	for(String a:states)
	{
		System.out.println(a);
	}
	
	//for iterate on all
	Iterator<String> itr=states.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+" ");
	}
}
}
