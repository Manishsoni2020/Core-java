package arrays;


public class Array_Question {
public static void main(String[] args) {
	int rowsize[]= {2,3,4,1,3,2};
	
	char[][] arr=new char[rowsize.length][];
	char ch='A';
	for(int i=0;i<rowsize.length;i++)
	{
		arr[i]=new char[rowsize[i]];
		for(int j=0;j<rowsize[i];j++)
		{
			arr[i][j]=ch++;
		}
	}
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
