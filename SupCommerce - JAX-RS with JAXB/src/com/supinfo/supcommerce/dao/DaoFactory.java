package com.supinfo.supcommerce.dao;

import com.supinfo.supcommerce.dao.jpa.JpaCategoryDao;
import com.supinfo.supcommerce.dao.jpa.JpaProductDao;
import com.supinfo.supcommerce.util.PersistenceManager;

public final class DaoFactory {
	
	private static DaoFactory instance;
	
	private CategoryDao categoryDao;
	private ProductDao productDao;
	
	public static DaoFactory getInstance() {
		if(instance == null) {
			instance = new DaoFactory();
		}
		return instance;
	}
	
	public CategoryDao getCategoryDao() {
		if(categoryDao == null) {
			categoryDao = new JpaCategoryDao(PersistenceManager.getEntityManagerFactory());
		}
		return categoryDao;
	}
	
	public ProductDao getProductDao() {
		if(productDao == null) {
			productDao = new JpaProductDao(PersistenceManager.getEntityManagerFactory());
		}
		return productDao;
	}

}
