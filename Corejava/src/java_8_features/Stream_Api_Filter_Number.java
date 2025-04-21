package java_8_features;

import java.util.LinkedList;

public class Stream_Api_Filter_Number {
public static void main(String[] args) {
	LinkedList<Integer> ll=new LinkedList<Integer>();
	ll.add(25);
	ll.add(14);
	ll.add(63);
	ll.add(33);
	ll.add(716);
	
	ll.stream().filter(x-> x>25) //convert list in stream and perform filtering
	.forEach(x -> System.out.println(x));
}
}
