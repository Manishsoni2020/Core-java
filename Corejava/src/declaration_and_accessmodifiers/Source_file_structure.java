package declaration_and_accessmodifiers;


public class Source_file_structure {
	public static void main(String[]args)
	{
		
//	1.	package import is very good habbit to increase code readablity
//		import java.util.ArrayList;
//		public class Main 
//		{
//		    public static void main(String[] args)
//		    {
//		        ArrayList<Integer> al=new ArrayList<>();
//		        al.add(10);
//		        al.add(20);
//		        al.add(30);
//		        for(int a:al)
//		        {
//		            System.out.print(a+" ");
//		        }
//		    }
//		}
		
//		2.Dont use same package bcz it will get ambiguty error
//		import java.util.*;
//		import java.sql.*;
//		public class Main 
//		{
//		    public static void main(String[] args)
//		    {
//		        Date dt=new Date();
//		        System.out.println(dt);
//		    }
//		}
		
//		Quetion for pattern class validation or not
//		import java.*;                   NOT VALID
//		import java.util.*;              NOT VALID
//		import java.util.regex.*;        VALID
//		import java.util.regex.Pattern;  VALID
		
		
//		3.Mostly class contains same name of variable and method is very common
//		import static java.lang.Integer.*;
//		import static java.lang.Byte.*;
//		public class Main 
//		{
//		    public static void main(String[] args)
//		    {
//		        System.out.println(MAX_VALUE);
//		    }
//		}
	}
}
