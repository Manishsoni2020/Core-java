package oops_Encapsulation;


class Student_Details
{
	private int roll_no;
	private String name;
	
	public void setrollno(int roll_no)
	{
		this.roll_no=roll_no;
	}
	public int getrollno()
	{
		return roll_no;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}
public class Student {
	public static void main(String[]args)
	{
		Student_Details sd=new Student_Details();
		sd.setrollno(25);
		sd.setName("Manish Soni");
		
		System.out.println(sd.getrollno());
		System.out.println(sd.getName());
	}
}
