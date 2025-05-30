package comparable_comparator;

import java.util.*;

class Student implements Comparable<Student>
{
	int id;
	String name;
	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int compareTo(Student s)
	{
		return this.id-s.id;
	}
	public String toString()
	{
		return id+" - "+name;
	}
}
public class Comparable_demo {
public static void main(String[] args) {
	TreeSet<Student> ts=new TreeSet<Student>();
	ts.add(new Student(106,"kajal"));
	ts.add(new Student(101,"sujata"));
	ts.add(new Student(105,"krishna"));
	
	for(Student s: ts)
	{
		System.out.println(s);
	}
}
}
