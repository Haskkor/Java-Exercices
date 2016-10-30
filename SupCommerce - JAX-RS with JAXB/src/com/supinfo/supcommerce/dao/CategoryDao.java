package com.supinfo.supcommerce.dao;

import java.util.List;

import com.supinfo.supcommerce.entity.Category;

public interface CategoryDao {
	
	Category addCategory(Category category);
	Category getCategoryById(Long categoryId);
	List<Category> getAllCategories();
	List<Category> getAllCategoriesWithProducts();
	void removeCategory(Long categoryId);
	void updateCategory(Category category);
	Category getCategoryByIdWithProducts(Long categoryId);

}
