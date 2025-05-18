package map_Collection_interface;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Linked_Hash_Map {
public static void main(String[]args)
{
	LinkedHashMap<Integer, String> lhm=new LinkedHashMap<>();
	lhm.put(101, "Suresh");
	lhm.put(102, "jagdish");
	lhm.put(103, "Himanshu");
	lhm.put(null, null);
	System.out.println(lhm);
	
	lhm.put(102, "naresh");
	
	System.out.println(lhm.get(103));
	
	System.out.println(lhm.containsKey(105));
	System.out.println(lhm.containsValue("Rohit"));
	
	System.out.println(lhm.size());
	System.out.println(lhm.isEmpty());
	
	lhm.remove(null);
	System.out.println(lhm);
	
	System.out.println(lhm.keySet());
	System.out.println(lhm.values());
	
	for(Map.Entry<Integer, String> entry:lhm.entrySet())
	{
		System.out.println(entry.getKey()+" => "+entry.getValue());
	}
}
}
