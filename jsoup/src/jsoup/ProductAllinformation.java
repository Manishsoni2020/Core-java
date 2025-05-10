package jsoup;

public class ProductAllinformation {
	private String sku;
	private String price;
	
	
	public ProductAllinformation(String sku, String price) {
		super();
		this.sku = sku;
		this.price = price;
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
	
}
