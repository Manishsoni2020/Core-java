package map_collection;

import java.util.*;
public class Treemap_demo2 {
public static void main(String[] args) {
	TreeMap t=new TreeMap(new MyComarator());
	t.put("xxx", 10);
	t.put("AAA", 20);
	t.put("zzz", 30);
	t.put("LLL", 40);
	System.out.println(t);
}
}
class MyComarator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		String s1=o1.toString();
		String s2=o2.toString();
		return s1.compareTo(s2);
	}
}
