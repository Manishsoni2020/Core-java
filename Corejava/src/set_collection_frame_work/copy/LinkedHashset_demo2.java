package set_collection_frame_work.copy;

import java.util.*;

public class LinkedHashset_demo2 {
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("B");
		lhs.add("C");
		lhs.add("F");
		lhs.add("M");
		lhs.add(null);
		lhs.add(10);
		System.out.println(lhs.add("M"));
		System.out.println(lhs);
	}
}
