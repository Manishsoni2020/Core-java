package arrays_class;

import java.util.*;
public class Array_to_arraylist {
public static void main(String[] args) {
	String[] s= {"A","Z","B"};
	List l=Arrays.asList(s);
	System.out.println(l);
	l.add("durga");
	System.out.println(l);
}
}
