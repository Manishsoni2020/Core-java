package com.jsoupdatafatching.jsoupdatafatching;

import java.net.URI;
import java.net.URL;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
@JsonIgnoreProperties(ignoreUnknown=true)
class Product 
{
	public long id;
	public String title;
	public String handle;
	public String body_html;
	public String published_at;
	public String created_at;
	public String updated_at;
	public String vendor;
	public String product_type;
	public List<String> tags;
	public List<Variant> variants;
	public List<Images> images;
	public List<Options> options;
}
@JsonIgnoreProperties(ignoreUnknown=true)
class Variant 
{
	public long id;
	public String title;
	public String option1;
	public String option2;
	public String option3;
	public String sku;
	public boolean requires_shipping;
	public boolean taxable;
	public String featured_image;
	public boolean available;
	public String price;
	public int grams;
	public String compare_at_price;
	public int position;
	public long product_id;
	public String created_at;
	public String updated_at;

}
@JsonIgnoreProperties(ignoreUnknown=true)
class Images 
{
	public long id;
	public String created_at;
	public int position;
	public String updated_at;
	public long product_id;
	public String src;
	public int width;
	public int height;
}
@JsonIgnoreProperties(ignoreUnknown=true)
class Options 
{
	public String name;
	public int position;
	public List<String> values;
}
class ProductResponse 
{
	public List<Product> products;
}
public class PdpaulaPasringProductJson {
public static void main(String[]args)
{
	
	try {

		URI uri=new URI("https://www.pdpaola.com/collections/rings/products.json");
		URL url=uri.toURL();
		ObjectMapper mapper=new ObjectMapper();
		
		ProductResponse response=mapper.readValue(url, ProductResponse.class);
		
		List<Product> products=response.products;
		
		for(Product product:products)
		{
			System.out.println("Product Id is: "+product.id);
			System.out.println("Product Title is: "+product.title);
			System.out.println("Product handled by :"+product.handle);
			System.out.println("Product Description: "+product.body_html);
			System.out.println("Product Vendor: "+product.vendor);
			System.out.println("Product Type: "+product.product_type);
			for(String tag:product.tags)
			{
				System.out.println("Product tag: "+tag);
			}
			
			System.out.println("Variants:");
			for(Variant variant:product.variants)
			{
				System.out.println("Variant Id: "+variant.id);
				System.out.println("Variant Sku: "+variant.sku);
				System.out.println("Variant Availabe: "+variant.available);
				System.out.println("Variant Price: "+variant.price);
				System.out.println("Variant Prduct Id: "+variant.product_id);
				
			}
			
			System.out.println("Images: ");
			for(Images images:product.images)
			{
				System.out.println("Image Id: "+images.id);
				System.out.println("Image Src: "+images.src);
				System.out.println("Image width: "+images.width);
				System.out.println("Image height: "+images.height);
			}
			
			System.out.println("Options: ");
			for(Options options:product.options)
			{
				System.out.println("Values: "+options.values);
			}
			System.out.println("===========================");
		}
		
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	
}
}
