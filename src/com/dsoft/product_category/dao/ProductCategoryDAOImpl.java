package com.dsoft.product_category.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Map<String, Object>> findAll() {
		List<Map<String, Object>> results = new ArrayList<Map<String, Object>>();
		try {
			DetachedCriteria criteria = DetachedCriteria.forClass(ProductCategory.class, "pc");
			ProjectionList projectionList = Projections.projectionList();
			projectionList.add(Projections.property("pc.id"), "id");
			projectionList.add(Projections.property("pc.categoryName"), "categoryName");
			criteria.setProjection(projectionList);
			criteria.addOrder(Order.asc("pc.id"));
			criteria.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
			Session session = sessionFactory.getCurrentSession();
			results = criteria.getExecutableCriteria(session).list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return results;
	}

}
