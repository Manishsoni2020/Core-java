package map_collection;

import java.util.*;
public class Hashmap_demo {
public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put("jaipur", 100);
	hm.put("jodhpur", 364);
	hm.put("sikar", 63);
	hm.put("churu", 112);
	System.out.println(hm);
	hm.put("jaipur", 1000);
	System.out.println(hm);
	
	Set s=hm.keySet();
	System.out.println(s);
	
	Collection ct=hm.values();
	System.out.println(ct);
	
	Set s1=hm.entrySet();
	Iterator itr=s1.iterator();
	while(itr.hasNext())
	{
		Map.Entry m1=(Map.Entry)itr.next();
		System.out.println(m1.getKey()+"  "+m1.getValue());
		if(m1.getKey().equals("sikar"))
		{
			m1.setValue(2000);
		} 
		System.out.println(hm);
	}
	
}
}
