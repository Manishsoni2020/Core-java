package collections_class;

import java.util.*;

class MyComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return i2.compareTo(i1);
	}
	
}

public class List_searching2 {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(22);
	al.add(53);
	al.add(3);
	al.add(44);
	al.add(16);
	System.out.println(al);
	Collections.sort(al,new MyComparator());
	System.out.println(al);
	System.out.println(Collections.binarySearch(al, 3, new MyComparator()));
	System.out.println(Collections.binarySearch(al, 13, new MyComparator()));
}
}