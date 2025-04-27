package json_files;


import java.util.*;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
public class JavaObject_to_JSON {
public static void main(String[]args) throws IOException
{
	
	ObjectMapper mapper= new ObjectMapper();
	
	ArrayList<Employee> al=new ArrayList<Employee>();
	
	Employee e1=new Employee(25,"Rakesh",new Address("xyz","jhotwara","jaipur","rajasthan",302012));
	
	al.add(e1);
	
	
    Employee e2=new Employee(38,"Mukesh",new Address("abc","suncity","jodhpur","rajasthan",302012));
	
	al.add(e2);
	
	//for print jsondata which is convert
	 String jsondata= mapper.writeValueAsString(al);
	 System.out.println(jsondata);
	 
	 //for create json file of our javaobjectdata
	 //mapper.writeValue(new File("C:\\Users\\hp\\Desktop\\Objecttojson.json"), al);
}
}
class Employee 
{
	private int rollNo;
	private String name;
	private Address address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(int rollNo, String name, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	
}
class Address 
{
	private String street;
	private String area;
	private String city;
	private String state;
	private int zipcode;
	public Address(String street, String area, String city, String state, int zipcode) {
		super();
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
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
