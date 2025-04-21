package java_8_features;

import java.util.LinkedList;

public class Stream_Api_Reduce_MinValue {
public static void main(String[] args) {
	LinkedList<Integer> ll=new LinkedList<Integer>();
	ll.add(25);
	ll.add(14);
	ll.add(63);
	ll.add(33);
	ll.add(716);
	
	int minValue=ll.stream().reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b);
	System.out.println("Minimum value of list is "+minValue);
}
}
