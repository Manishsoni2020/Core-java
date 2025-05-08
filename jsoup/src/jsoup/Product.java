package jsoup;

public class Product {
	
private String Name;
private String Price;
private String Description;

public Product(String name, String price, String description) {
	super();
	Name = name;
	Price = price;
	Description = description;
}

public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getPrice() {
	return Price;
}
public void setPrice(String price) {
	Price = price;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
}
