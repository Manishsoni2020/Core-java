package list_collection_frame_work;

import java.util.*;
public class Vector_demo {
	public static void main(String[]args)
	{
		Vector v=new Vector();
		for(int i=1;i<=8;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		v.addElement("A");
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.removeElementAt(3);
		System.out.println(v);
		v.removeAllElements();
		System.out.println(v);
	}
}
