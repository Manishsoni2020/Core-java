//package comparable_comparator;
//
//import java.util.*;
//class Student 
//{
//	int rollno;
//	String name;
//	Student(int rollno, String name) {
//		this.rollno = rollno;
//		this.name = name;
//	}
//	@Override
//	public String toString() {
//		return "Student [rollno=" + rollno + ", name=" + name + "]";
//	}
//}
//class SortByName implements Comparator<Student>
//{
//	public int compare(Student s1,Student s2)
//	{
//		return s1.name.compareTo(s2.name);
//	}
//}
//public class Comparator_demo {
//public static void main(String[] args) {
//	TreeSet<Student> ts=new TreeSet<Student>();
//	ts.add(new Student(102, "manish"));
//	ts.add(new Student(104, "rakesh"));
//	ts.add(new Student(101, "aniket"));
//	
//	   for (Student s : ts) {
//           System.out.println(s);
//       }
//}
//}
