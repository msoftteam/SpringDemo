package com.dsoft.product_category.dao;

import java.util.Map;

import com.dsoft.product_category.model.ProductCategoryModel;

public interface ProductCategoryDAO {
	Map<String, Object> save(ProductCategoryModel model);
}
