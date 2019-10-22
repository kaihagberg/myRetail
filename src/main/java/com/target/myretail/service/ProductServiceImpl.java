package com.target.myretail.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.target.myretail.model.Price;
import com.target.myretail.model.Product;
import com.target.myretail.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired PriceRepository priceRepository;

	public Product getProductById(String id) {
		String productDetailsString = getProductDetails(id);
		JsonObject productDetailsJsonObject = JsonParser.parseString(productDetailsString).getAsJsonObject();
		Product productDetails = parseProductDetailsObj(productDetailsJsonObject, id);
		Price priceDetails = getPriceDetails(id);
		joinProductAndPriceDetails(productDetails, priceDetails);
		return productDetails;
	}

	private String getProductDetails(String id) {
		final String uri = "https://redsky.target.com/v2/pdp/tcin/" + id;
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(uri, String.class);
	}

	private Product parseProductDetailsObj(JsonObject productDetailsJson, String id) {
		Product product = new Product();
		product.setId(id);
		product.setName(productDetailsJson
				.get("product").getAsJsonObject()
				.get("item").getAsJsonObject()
				.get("product_description").getAsJsonObject()
				.get("title").getAsString());
		product.setPrice(getPriceDetails(id));
		return product;
	}

	private Price getPriceDetails(String id) {
		return priceRepository.findPriceById(id);
	}

	private void joinProductAndPriceDetails(Product productDetails, Price priceDetails) {
		productDetails.setPrice(priceDetails);
	}
}
