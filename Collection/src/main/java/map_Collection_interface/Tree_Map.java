package map_Collection_interface;

import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {
public static void main(String[]args)
{
	TreeMap<Integer, String> students=new TreeMap<>();
	students.put(103, "ravi");
	students.put(101, "kunal");
	students.put(105, "sonam");
	students.put(102, "geeta");
	students.put(104, null);
	
	System.out.println(students); //sorted print
	
	System.out.println(students.get(102));
	
	students.remove(105);
	System.out.println(students);
	
	System.out.println(students.containsKey(101));
	System.out.println(students.containsValue("geeta"));
	
	System.out.println(students.size());
	System.out.println(students.isEmpty());
	
	System.out.println(students.keySet());
	System.out.println(students.values());
	
	for(Map.Entry<Integer, String> entry:students.entrySet())
	{
		System.out.println(entry.getKey()+" => "+entry.getValue());
	}
	
	students.clear();
	System.out.println(students);
}
}
