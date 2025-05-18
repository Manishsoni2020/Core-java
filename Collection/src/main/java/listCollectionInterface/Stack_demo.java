package listCollectionInterface;

import java.util.Stack;

public class Stack_demo {
public static void main(String[]args)
{
	Stack<String> books=new Stack<>();
	books.push("java");
	books.push("Python");
	books.push("C++");
	System.out.println(books);
	
	System.out.println(books.peek());
	
	books.pop(); //Last element delete
	System.out.println(books);
	
	System.out.println(books.search("java")); //Give us index number 
	
	System.out.println(books.empty()); 
	books.clear();
	System.out.println(books.empty());
}
}
