package list_collection_frame_work;

import java.util.*;
public class Stack_demo {
	public static void main(String[] args) {
		Stack st=new Stack();
		st.push("A");
		st.push("B");
		st.push("C");
		System.out.println(st);
		System.out.println(st.search("A"));
		System.out.println(st.search("P"));
	}
}
