package com.dsoft.product_category.service;

import java.util.Map;

import com.dsoft.product_category.model.ProductCategoryModel;

public interface ProductCategoryService {
	Map<String, Object> save(ProductCategoryModel model);
}
