package com.mindtree.apnadukan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.apnadukan.entity.Product;

@RestController
@RequestMapping(value = "/dukan")
@CrossOrigin
public class DukanController {
	private static ArrayList<Product> products = new ArrayList<>();

	static {
		products.add(new Product(1, "Sony bravia"));
		products.add(new Product(2, "Apple S6"));
		products.add(new Product(3, "Parle G"));
		products.add(new Product(4, "Sony bravia"));
		products.add(new Product(5, "LG 5400"));
		products.add(new Product(6, "Sony bravia"));

	}

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<Product> getProducts() {
		return products;
	}
}
