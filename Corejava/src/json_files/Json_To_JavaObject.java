package json_files;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.json.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
@JsonIgnoreProperties(ignoreUnknown = true)
class Student
{
	private int rollNo;
	private String name;
	private Home home;
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
	public Home getHome() {
		return home;
	}
	public void setHome(Home home) {
		home = home;
	}
}
class Home 
{
	private String street;
	private String area;
	private String city;
	private String state;
	private int zipcode;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
}
public class Json_To_JavaObject {
public static void main(String[]args)
{
	File file=new File("C:\\Users\\hp\\Desktop\\Objecttojson.json");
	ObjectMapper obj=new ObjectMapper();
	try {
		List<Student> std = obj.readValue(file, obj.getTypeFactory().constructCollectionType(List.class, Student.class));
		
		for(Student stds: std)
		{
			System.out.println("Student roll no : "+stds.getRollNo());
			System.out.println("Student roll no : "+stds.getName());
			System.out.println("Street : " + stds.getHome().getStreet());
            System.out.println("City : " + stds.getHome().getCity());
            System.out.println("State : " + stds.getHome().getState());
            System.out.println("Zipcode : " + stds.getHome().getArea());
		}

		
	} catch (StreamReadException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (DatabindException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
