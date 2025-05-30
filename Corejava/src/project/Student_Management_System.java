package project;

import java.util.ArrayList;
import java.util.Scanner;

class Student
{
	private int rollNo;
	private String name;
	private String course;
	
   Student(int rollNo, String name, String course) {
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
	}
   
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + "]";
	}
}
public class Student_Management_System {
	static ArrayList<Student> al=new ArrayList<Student>();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		while(true)
		{
			System.out.println("\n=========STUDENT MANAGEMENT SYSTEM=============");
			System.out.println("1. Add Student");
			System.out.println("2. Display All Students");
			System.out.println("3. Search Student by Roll No.");
			System.out.println("4. Delete Student");
			System.out.println("5. Exit");
			System.out.println("Enter Your Choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				addStudent();
				break;
				
			case 2:
				displayStudents();
				break;
				
			case 3:
				searchStudent();
				break;
				
			case 4:
				deleteStudent();
				break;
				
			case 5:
				System.out.println("Exiting program......!");
				return;
				
				default :
					System.out.println("Invelid choice");
			}
		}
	}
	static void addStudent()
	{
		System.out.println("Enter roll no.");
		int rollNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your Name ");
		String name=sc.nextLine();
		
		System.out.println("Enter your Course Name ");
		String course=sc.nextLine();
		
		Student obj=new Student(rollNo, name, course);
		al.add(obj);
		
		System.out.println("Student added Successfully");
	}
	
	static void displayStudents()
	{
		if(al.isEmpty())
		{
			System.out.println("No found student record");
		}
		System.out.println("All Students details are");
		for(Student s:al)
		{
			System.out.println(s);
		}
	}
	static void searchStudent()
	{
		System.out.println("Enter student Roll No.");
		int rollNo=sc.nextInt();
		
		for(Student s: al)
		{
			if(s.getRollNo()== rollNo)
			{
				System.out.println("Student found :"+s);
				
			}
		}
	}
	static void deleteStudent()
	{
		System.out.println("Enter Student Roll no.");
		int rollNo=sc.nextInt();
		boolean removed=false;
		
		if(removed==false)
		{
			System.out.println("No student found");
		}
		for(Student s:al)
		{
			if(s.getRollNo()==rollNo)
			{
				al.remove(s);
				System.out.println("Student delete successfully");
				removed=true;
				break;
			}	 
		}
		
	}
}
