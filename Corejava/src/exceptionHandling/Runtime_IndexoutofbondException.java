package exceptionHandling;

public class Runtime_IndexoutofbondException {
public static void main(String[] args) {
//	  int[]a=new int[5];
//	  System.out.println(a[6]);
	  
	  try
	  {
		  int[]a=new int[5];
		  System.out.println(a[6]);
	  }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
		  System.out.println("Exception handle");
	  }
}
}
