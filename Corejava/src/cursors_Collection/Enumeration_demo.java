package cursors_Collection;

import java.util.*;
public class Enumeration_demo {
public static void main(String[] args) {
//	Enumeration is applicable for legacy classes only
	Vector vt=new Vector();
	for(int i=1;i<=10;i++) {
		vt.addElement(i);
	}
	System.out.println(vt);
	Enumeration em=vt.elements();
	while(em.hasMoreElements())
	{
		Integer i=(Integer)em.nextElement();
		if(i%2==0)
		{
			System.out.println(i);
		}
		
	}
	System.out.println(vt);

}
}
