package collections_class;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_list {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(40);
	al.add(20);
	al.add(55);
	al.add(5);
	al.add(100);
	System.out.println(al);
	Collections.reverse(al);
	System.out.println(al);

}
}
