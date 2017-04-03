package com.dsoft.product_category.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dsoft.product_category.model.ProductCategoryModel;
import com.dsoft.product_category.service.ProductCategoryService;

@RestController
@RequestMapping("/product_category")
public class ProductCategoryController {
	
	@Autowired
	private ProductCategoryService productCategoryService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody ProductCategoryModel model) {
		return productCategoryService.save(model);
	}
}
