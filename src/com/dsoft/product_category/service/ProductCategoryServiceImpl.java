package com.dsoft.product_category.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsoft.product_category.dao.ProductCategoryDAO;
import com.dsoft.product_category.model.ProductCategoryModel;

@Service
@Transactional
public class ProductCategoryServiceImpl implements ProductCategoryService {

	@Autowired
	private ProductCategoryDAO productCategoryDAO;
	
	@Override
	public Map<String, Object> save(ProductCategoryModel model) {
		return productCategoryDAO.save(model);
	}

}
