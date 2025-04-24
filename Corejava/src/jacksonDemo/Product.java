package jacksonDemo;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Product {
	public String reference;
	public LocalDate date;
	public String domain;
	public String domain_url;
	public String collection_name;
	public String brand;
	public String manufacturer;
	public String url;
	public String image_folder;
	public List<String> images;
	public String category;
	
	public Map<String,Langcontent> content;
	
	public Map<String,Langspec> specification;
	
	public static class Langcontent
	{
		public String description;
		public String productName;
	}

	public static class Langspec {
	    public String lang;
	    public String domain_country_code;
	    public String currency;
	    public String base_price;
	    public String sales_price;
	    public String active_price;
	    public String stock_quantity;
	    public String availability;
	    public String availability_message;
	    public String shipping_lead_time;
	    public String shipping_expenses;
	    public String marketplace_retailer_name;
	    public String condition;
	    public String reviews_rating_value;
	    public String reviews_number;
	    public String product_link;
	}

}

