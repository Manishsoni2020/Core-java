package java_8_features;

interface Student 
{
	void StudentName(String name); //one parameter
}
public class Lambda_Expressions_Demo2 {
public static void main(String[] args) {
	Student c=(name)->{
		System.out.println("Student Name is : "+name);
	};
	c.StudentName("Deepak");
}
}
