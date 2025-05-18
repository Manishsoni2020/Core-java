package listCollectionInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List {
public static void main(String[]args)
{
	ArrayList<String> al=new ArrayList<>();
	al.add("Manish");
	al.add("Ayush");
	al.add("Madan");
	al.add("Suresh");
	System.out.println(al);
	
	//make another copy of list
	ArrayList<String> al2=new ArrayList<>();
	al2.addAll(al);
	System.out.println(al2);
	
	al.set(1, "umesh"); //for replace element
	System.out.println(al);
	System.out.println(al.size()); //for get size of list
	al.clear(); //for make empty list
	al.remove(0);    //remove particular index element
	al.removeAll(al); //remove all elements
	System.out.println(al.get(2)); //for get value from partiucal index number
	for(String a: al)  
	{
		System.out.println(a+" ");
		
	}
	Iterator<String> itr=al.iterator();  //Iterating 
	while(itr.hasNext())
	{
		String name=itr.next();
		System.out.println(name);
		if(name.equals("Manish"))
		{
			itr.remove(); //remove element through Iterator
		}
		
	}
	System.out.println(al);
	
}
}
