package map_collection;

import java.util.*;
public class Identity_hashMap_demo {
public static void main(String[] args) {
	HashMap<Integer, String> ihm=new HashMap<Integer, String>();
	Integer i1=new Integer(10);
	Integer i2=new Integer(10);
	ihm.put(i1, "pawan");
	ihm.put(i2, "kalyan");
	System.out.println(ihm);
}
}
