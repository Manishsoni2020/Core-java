package com.michaelkors.michaelkors;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDetails {
private String productID;

public String getProductID() {
	return productID;
}

public void setProductID(String productID) {
	this.productID = productID;
}
}
