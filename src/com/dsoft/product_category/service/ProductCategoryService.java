package com.dsoft.product_category.service;

import java.util.List;
import java.util.Map;

import com.dsoft.product_category.model.ProductCategoryModel;

public interface ProductCategoryService {
	Map<String, Object> save(ProductCategoryModel model);
	List<Map<String, Object>> findAll();
}
