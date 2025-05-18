package map_Collection_interface;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
public static void main(String[]args)
{
	HashMap<Integer, String> students=new HashMap<>();
	students.put(1, "Raj");
	students.put(2, "Deepak");
	students.put(4, "Nihal");
	students.put(3, "Gopal");
	students.put(5, "Aman");
	students.put(2, "Rajesh"); //duplicate key, old value replaced
	
	System.out.println(students);
	
	System.out.println(students.get(4));
	
	System.out.println(students.containsKey(5));
	
	System.out.println(students.containsValue("Aman"));
	
	students.remove(4);
	System.out.println(students);
	
	System.out.println(students.keySet());
	System.out.println(students.values());
	
	students.replace(5, "Aman", "Sudhire");
	students.replace(1, "madan");
	System.out.println(students);
	
	for(Map.Entry<Integer, String> entry: students.entrySet())
	{
		System.out.println(entry.getKey()+" =>  "+entry.getValue());
	}
}
}
