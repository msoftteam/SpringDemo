package com.dsoft.product_category.dao;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dsoft.product_category.entity.ProductCategory;
import com.dsoft.product_category.model.ProductCategoryModel;

@Repository
public class ProductCategoryDAOImpl implements ProductCategoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Map<String, Object> save(ProductCategoryModel model) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			Session session = sessionFactory.getCurrentSession();
			ProductCategory pc = new ProductCategory();
			pc.setCategoryName(model.getCategoryName());
			session.save(pc);
			result.put("status", true);
		} catch (Exception e) {
			result.put("status", false);
			e.printStackTrace();
		}
		return result;
	}

}
