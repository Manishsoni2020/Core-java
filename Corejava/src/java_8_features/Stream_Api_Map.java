package java_8_features;

import java.util.LinkedList;

public class Stream_Api_Map {
public static void main(String[] args) {
	LinkedList<Integer> ll=new LinkedList<Integer>();
	ll.add(25);
	ll.add(14);
	ll.add(63);
	ll.add(33);
	ll.add(716);
	
	ll.stream().map(a -> a*2) //convert list into stream and perform map()
	.forEach(a -> System.out.println(a));
}
}
