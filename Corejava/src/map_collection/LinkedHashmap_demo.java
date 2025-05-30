package map_collection;

import java.util.*;
public class LinkedHashmap_demo {
public static void main(String[] args) {
	LinkedHashMap<Integer, String> lhm=new LinkedHashMap<Integer, String>();
	lhm.put(1, "rohan");
	lhm.put(2, "suresh");
	lhm.put(null, "rakesh");
	lhm.put(5, null);
	System.out.println(lhm);
	System.out.println(lhm.get(null));
	System.out.println(lhm.containsKey(5));
	lhm.remove(2);
	System.out.println(lhm);
	System.out.println(lhm.size());
	
	for(Map.Entry<Integer, String> entry: lhm.entrySet())
	{
		System.out.println(entry.getKey()+" => "+entry.getValue());
	}
	lhm.replace(null, "mahesh");
	System.out.println(lhm);
	lhm.clear();
	System.out.println(lhm);
}
}
