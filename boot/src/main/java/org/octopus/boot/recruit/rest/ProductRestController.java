package org.octopus.boot.recruit.rest;

import org.octopus.boot.recruit.domain.Product;
import org.octopus.boot.recruit.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

@RestController
@RequestMapping("/products")
public class ProductRestController {
	private ProductService productService;

	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Iterable list(Model model) {
		Iterable productList = productService.listAllProducts();
		return productList;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Product showProduct(@PathVariable Integer id, Model model) {
		Product product = productService.getProductById(id);
		return product;
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity saveProduct(@RequestBody Product product) {
		productService.saveProduct(product);
		return new ResponseEntity("Product saved successfully", HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity updateProduct(@PathVariable Integer id, @RequestBody Product product) {
		Product storedProduct = productService.getProductById(id);
		storedProduct.setDescription(product.getDescription());
		storedProduct.setImageUrl(product.getImageUrl());
		storedProduct.setPrice(product.getPrice());
		productService.saveProduct(storedProduct);
		return new ResponseEntity("Product updated successfully", HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity delete(@PathVariable Integer id) {
		productService.deleteProduct(id);
		return new ResponseEntity("Product deleted successfully", HttpStatus.OK);

	}
}
