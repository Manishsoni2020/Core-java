package jacksonDemo;

import java.io.IOException;
import java.nio.file.Path;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.*;

public class ProjectMain {
public static void main(String[]args) throws StreamReadException, DatabindException, IOException
{
	ObjectMapper mapper=new ObjectMapper().registerModule(new JavaTimeModule());
	
	Path path=Path.of("C:\\Users\\hp\\Desktop\\Data1.json");
	
	Product prod=mapper.readValue(path.toFile(), Product.class);
	
	System.out.println("Reference :"+prod.reference);
	System.out.println("Brand :"+prod.brand);
	System.out.println("EN name :"+prod.content.get("en").productName);
	System.out.println("EN price :"+prod.specification.get("en").base_price);
	System.out.println("Images  :"+prod.images.size());
}
}
