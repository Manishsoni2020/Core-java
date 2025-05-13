package jsoup;

import java.util.List;

public class ProductAllinformation {
	private String sku;
	private String price;
	private String date;
    private String domain;
    private String domain_url;
    private String collection_name;
    private String brand;
    private String manufacturer;
	private List<String> images; 
	private List<String> color;
	private String metarial;
	public ProductAllinformation(String sku, String price, String date, String domain, String domain_url,
			String collection_name, String brand, String manufacturer, List<String> images, List<String> color,
			String metarial) {
		super();
		this.sku = sku;
		this.price = price;
		this.date = date;
		this.domain = domain;
		this.domain_url = domain_url;
		this.collection_name = collection_name;
		this.brand = brand;
		this.manufacturer = manufacturer;
		this.images = images;
		this.color = color;
		this.metarial = metarial;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getDomain_url() {
		return domain_url;
	}
	public void setDomain_url(String domain_url) {
		this.domain_url = domain_url;
	}
	public String getCollection_name() {
		return collection_name;
	}
	public void setCollection_name(String collection_name) {
		this.collection_name = collection_name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public List<String> getImages() {
		return images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
	public List<String> getColor() {
		return color;
	}
	public void setColor(List<String> color) {
		this.color = color;
	}
	public String getMetarial() {
		return metarial;
	}
	public void setMetarial(String metarial) {
		this.metarial = metarial;
	}
	
	

	
}
