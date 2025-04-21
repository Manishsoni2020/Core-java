package java_8_features;

import java.util.LinkedList;

public class Stream_Api_Filter_Alphabets {
public static void main(String[] args) {
	LinkedList<String> ll=new LinkedList<String>();
	ll.add("Apple");
	ll.add("Banana");
	ll.add("Papaya");
	ll.add("Coconut");
	ll.add("Mango");
	
	ll.stream().filter(x-> x.contains("p"))
	.forEach(x-> System.out.println(x));
}
}
