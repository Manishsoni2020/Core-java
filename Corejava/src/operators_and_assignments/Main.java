package operators_and_assignments;

public class Main {
	public static void main(String[] args)
	{
//		1.Increment/Decrement=>
//		type of increment:> 
//		 1. Pre increment Exp=> int x =++y;
//		 2. Post increment Exp=> int x=y++;
		
//		Type of Decrement=>
//		1.Pre decrement Exp=>  int x =--y;
//		2.Post decrement Exp=> int u=y--;
		
//		Exp=>
//		double d=10.5;
//		d++;
//		System.out.println(d); output=11.5
		
//		char c='a';
//		c++;
//		System.out.println(c); output=b
		
//		boolean b=true;
//		b++;
//		System.out.println(b); C.E type mismatch
		
//		int x=10;
//		x++;
//		System.out.println(x); output=11
		
		
//		2.Arithmetic operators=>(+,-,*,/,%)
		
//		byte a=10;
//		byte b=20;
//		int c=a+b;
//		System.out.println(c); output=30;
		
		
//		System.out.println(0/0.0);output=NaN
		
		
//		3.String Concatination Operator(+)
//		int a=10,b=20,c=30;
//		String d="java";
//		System.out.println(a+b+c+d); output=60java
//		System.out.println(a+b+d+c); output=30java30
//		System.out.println(d+a+b+c); output=java102030
//		System.out.println(a+d+b+c); output=10java2030
				
		
//		4. Relational Operators(>,<,>=,<=)
//		System.out.println(10>20);        false
//		System.out.println(50>20);        true
//		System.out.println(10>=10.0);     true
//		System.out.println('a'<125);      true
		
		
//		5. Equality Operators (==,!=)
//		System.out.println(10==10.0);      true
//		System.out.println('a'==97);       true
//		System.out.println(true==false);   false
//		System.out.println(10.5==12.3);    false
		
//		Exp=>
//		class A extends Thread
//		{
//		    public void run()
//		    {
//		        System.out.println("java is programing language");
//		    }
//		}
//		public class Main 
//		{
//		    public static void main(String[] args)
//		    {
//		        A t1=new A();
//		        A t2=new A();
//		        System.out.println(t1 == t2);
//		        A t3=t1;
//		        System.out.println(t1==t3);
//		    }
//		}
		
//		6. Instanceof Operator=> This is use to check the object is related of that class or interface or not
		
//		Exp=>
//		class A extends Thread
//		{
//		    public void run()
//		    {
//		        System.out.println("java is programing language");
//		    }
//		}
//		public class Main 
//		{
//		    public static void main(String[] args)
//		    {
//		        A t1=new A();
//		        System.out.println(t1 instanceof Thread);       True
//		        System.out.println(t1 instanceof Runnable);     True
//		        System.out.println(t1 instanceof Object);       True
//		    }
//		}
		
//		7. Bitwise operator=>
//		System.out.println(4&5); output=4
//		System.out.println(4|5); output=5
//		System.out.println(4^5); output=1
//		System.out.println(~4);  output=-5
		
		
//		8.Boolean complement operator
//		int a=4;
//		System.out.println(!a);     Error
//		System.out.println(!false); True
//		System.out.println(!true);  False
		
//		9.short-circuit-operators(&&,||)
		
//		int x=10;
//		if((++x<10)&&(x/0>10))
//		{
//			System.out.println("hello");
//		}
//		else 
//		{
//			System.out.println("hii");
//		}
//		output=hii
		
//		10.Type casting operators
//		   1.Implicit type casting=>
		
//		    double d=10;
//		    System.out.println(d); output=10.0
//		    
//		    int x='a';
//		    System.out.println(x); output=97
		
		
//		   2.Explicit type casting
		
//		     int i=150;
//		     short s=(short)i;
//		     System.out.println(s); output=150
//		     
//		     double d=130.326;
//		     int a=(int)d;
//		     byte b=(byte)d;
//		     System.out.println(a);  output=130
//		     System.out.println(b);  output=-126
		
//		  11.Assignment Operators=>
//		  
//		    1.simple assignment op=>
//		      int x=10;
		      
//		    2.chained assignment op=>
//		      int a,b,c,d;
//		      a=b=c=d=5;
		      
//		      System.out.println(b); output=5
//		      System.out.println(d); output=5
		       
//		     3.compund assignment op=>
//		      int a=10;
//		      a+=30;
//		      System.out.println(a);
		
//		      byte c=10;
//		      c=c+10;
//		      System.out.println(c);  output=C.E
		
//		      byte b=10;
//		      b+=20;
//		      System.out.println(b); output=30
		
//		   12.Conditional Operators=>like if else 
//		      int a=10;
//		      int b=20;
//		      int x=(a>b)?40:50;
//		      System.out.println(x); output=50
		      
//		      int age=25;
//		      String a=(age>18)?"elligble":"not elligble";
//		      System.out.println(a);
//		      output=elligble
		
//		    13.New operator=> For creation of object
//		       A obj=new A();
//		       String str=new String();
//		       StringBuffer sb=new StringBuffer();
		
//		    14. [] operator=> For creation of array
//		        int a[]= {1,2,3,4,5};
//		        char c[]= {'a','b','c','d'};
                 		
		   
//		 12.Evalution,order of operands
//		public class Main 
//		{
//		    public static int m1(int i)
//		    {
//		        System.out.println(i);
//		        return i;
//		    }
//		    public static void main(String[] args)
//		    {
//		        System.out.println(m1(1)+m1(2)*m1(3)+m1(4)*m1(5)/m1(6));
//		    }
//		}
		
	}
}
