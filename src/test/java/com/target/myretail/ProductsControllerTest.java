package com.target.myretail;

import com.target.myretail.controller.ProductsController;
import com.target.myretail.model.Product;
import com.target.myretail.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductsControllerTest {

	@Autowired
	ProductService productService;

	@Test
	public void testProductsController() {
		ProductsController controller = new ProductsController(productService);
		Product product = controller.getProduct("12945940");
		Assertions.assertEquals("Mountain Dew Citrus Soda - 12pk/12 fl oz Cans", product.getName());
		Assertions.assertEquals("$4.89", product.getPrice().getValue());
	}

}
