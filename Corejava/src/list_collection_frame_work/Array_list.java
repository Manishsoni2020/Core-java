package list_collection_frame_work;

import java.util.*;
public class Array_list {
public static void main(String[]args)
{
	ArrayList al=new ArrayList();
	al.add("A");
	al.add(10);
	al.add('A');
	al.add(null);
	System.out.print(al+" ");
	System.out.println();
	al.remove(2);
	System.out.println(al+" ");
	al.add(2, "M");
	al.add("N");
	System.out.println(al+" ");
	System.out.println("The size of this arraylist is :"+al.size());
	al.addAll(al);
	System.out.println(al);
	al.clear();
	System.out.println(al);
}
}
