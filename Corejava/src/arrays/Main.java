package arrays;

public class Main 
{
//	---------ARRAYS-----------//
//	An array is an indexed collection of fixed no. of homogeneous data elements
	public static void main(String [] args)
	{
//		1.Array Declaration=>
//		(i).Single Dimenshional Array Declaration
//		    int a[];
//		    int []a;
//		    int[] a;
		
//		(ii).2D Array Declaration
//		    int[][] a;
//		    int  [][]a;
//		    int  a[][];
//		    int[] a[];
//		    int[] []a;
//		    int  []a[];
		
//		(iii).3D Array Declaration
//		    int[][][] a;
//		    int  a[][][];
//		    int  [][][]a;
//		    int[] [][]a;
//		    int[] a[][];
//		    int[] []a[];
//		    int[][] []a;
		
//		2. Array Construction=>
//		  (i).Single diamenshional Array
//		      int[] a=new int[3];        VALID
//            byte b=10;                  
//            int[] j=new int[b];        VALID
//            int[] c=new int[10l];      NOT VALID
//            int[] d=new int[12.3];     NOT VALID
		
//		  (ii).2D Array
//		       int[][] a=new int[3][];
//		       a[0]=new int[2];
//		       a[1]=new int[3];
//		       a[2]=new int[4];
//		       
//		       int [][][] b=new int[2][][];
//		       b[0]= new int[3][];
//		       b[0][0]=new int[1];
//		       b[0][1]=new int[2];
//		       b[0][2]=new int[3];
//		       b[1]=new int[2][2];
		
//		  Question valid or not
//		  int[] a=new int[];               NOT VALID
//		  int[][] b=new int[3][2];         VALID
//		  int[][] c=new int[3][];          VALID
//		  int[][] d=new int[][2];          NOT VALID
//		  int[][][] e=new int[3][4][5];    VALID
//		  int[][][] f=new int[3][4][];     VALID
//		  int[][][] g=new int[3][][5];     NOT VALID
		
//		3.Array Initialization=>
		
//		1.  int[] a=new int[3];
//		    System.out.println(a); output=[I@372f7a8d (hashcode)
//		    System.out.println(a[0]); output=0;
		
//		2.  int[][] a=new int[3][2];
//		    System.out.println(a); output=[I@372f7a8d (hashcode)
//		    System.out.println(a[0]); output=[I@372f7a8d (hashcode)
//		    System.out.println(a[0][0]); output=0;
		
		    
//		4.Array Initialization=>
		
//	  1.  int[] a=new int[5];
//		  a[0]=10;
//		  a[1]=20;
//		  a[2]=30;
//		  a[3]=40;
//		  a[4]=50;
//		  
//	  2.  int[]b= {10,20,30,40,50};
//	  
//	  3. char[]c= {'a','e','i','o','u'};
//	  
//	  4. int[][] d= {{30,40,50},{60,70}};
//	  
//	  5. int[][][] e= {{{10,20,30},{40,50},{60}},{{70,80},{90,100},{1110}}};
	
//-----------------------------------------------------------------------
	  
//		5.length() vs length
		
//		1.length=> IT IS A FINAL VARIABLE APPLICABLE ONLY FOR ARRAY
//		           IT REPERESENT SIZE OF ARRAY
//		Exp=>
//		int[] a=new int[3];
//		System.out.println("The size of array is "+a.length);
		
//		2.length()=>IT IS FINAL METHOD APPLICABLE ONLY FOR STRING OBJECTS
//				    IT REPERSENT SIZE OF STRING
		
//		Exp=>
//		String s="Manish";
//		System.out.println(s.length());
//		
//		String str="Java is programing language";
//		System.out.println(str.length());
		  
		//----Annonymos Array Exp=>
//		public class Main 
//		{
//		    public static void main(String[] args)
//		    {
//		        sum(new int[]{10,20,30,40,50});   <=Annoynous array
//		    }
//		    public static void sum(int a[])
//		    {
//		        int total=0;
//		        for(int i=0;i<a.length;i++)
//		        {
//		            total=total+a[i];
//		        }
//		        System.out.println(total);
//		    }
//		}
		
//		6.Array Element Assignment
//		char --> int             VALID
//		char[]-->int[]           NOT VALID
//		int --> long             VALID
//		int[]--> long[]          NOT VALID
//		long-->int               NOT VALID
//		long-->double[]          NOT VALID
//		String-->object          VALID
//		String[]-->object[]      VALID
		
		
		
		  
	}
}
