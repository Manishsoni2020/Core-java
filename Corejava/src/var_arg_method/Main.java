package var_arg_method;

public class Main {
	
	//------------VAR-ARG-METHOD---------//
//	we can declare a method with variable no. of arrguments such type of methods are call var-arg-methods
	public static void main(String[]args)
	{
//	   1.Exp=>
//		public class Main 
//		{
//		    public static void show(int...i)
//		    {
//		        System.out.println("var-arg-method");
//		    }
//		    public static void main(String[] args)
//		    {
//		        show();
//		        show(10);
//		        show(10,20);
//		        show(10,20,30);
//		    }
//		}
		
//		2.Exp=>
//		public class Main 
//		{
//		    public static void sum(int...x)
//		    {
//		       int total=0;
//		       for(int y:x)
//		       {
//		           total=total+y;
//		       }
//		       System.out.println("The sum "+total);
//		    }
//		    public static void main(String[] args)
//		    {
//		        sum();
//		        sum(10,20);
//		        sum(10,20,30);
//		        sum(10,20,30,40);
//		    }
//		}
		
//		var-arg- VS single dimenshional Array
		
//		Case 1.
//		show(int[]x) replace=> show(int... x)             VALID
//		main(String[]args) replace=>main(String... x);    VALID
		
//		Case 2.
//		show(int... x) replace=> show(int[] x);           NOT VALID
//		 System.out.println(args[0]);
	}
}
