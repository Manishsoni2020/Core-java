package map_collection;

import java.util.*;
public class Treemap_demo {
public static void main(String[] args) {
	TreeMap m=new TreeMap();
	m.put(100, "zzz");
	m.put(103, "yyy");
	m.put(101, "xxx");
	m.put(104, 106);
	m.put(107, null);
	System.out.println(m);
}
}
