package oops_constructor;

class Library 
{
	int book_id;
	String writer;
	
	Library(int book_id,String writer) //parameterized constructor
	{
		this.book_id=book_id;
		this.writer=writer;
	}
	
	void display()
	{
		System.out.println("Book id is "+book_id);
		System.out.println("Writer name is "+writer);
	}
}
public class Parameterized_constructor 
{
	public static void main(String[]args)
	{
		Library lb=new Library(12, "Ravindra Nath Tegor");
		lb.display();
	}
}
