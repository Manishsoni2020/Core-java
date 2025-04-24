package jacksonDemo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonIgnoreProperties(ignoreUnknown=true)
class A 
{
	private String brand;
	private String model;
	
	@Override
	public String toString() {
		return "A [brand=" + brand + ", model=" + model + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
public class ObjectMapperDemo_annotation {
public static void main(String[]args) 
{
	String json="{\"brand\":\"ABC\",\"model\":\"XYZ\"}";
	ObjectMapper mapper=new ObjectMapper();
	try {
		A o=mapper.readValue(json, A.class);
		System.out.println(o);
	} catch (JsonMappingException e) {
		
		e.printStackTrace();
	} catch (JsonProcessingException e) {
		e.printStackTrace();
	}
	
}
}
