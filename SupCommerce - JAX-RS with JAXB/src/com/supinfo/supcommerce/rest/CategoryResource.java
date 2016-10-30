package com.supinfo.supcommerce.rest;

import java.net.URI;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import com.supinfo.supcommerce.dao.CategoryDao;
import com.supinfo.supcommerce.dao.DaoFactory;
import com.supinfo.supcommerce.entity.Category;

@Path("/categories")
public class CategoryResource {
	
	private CategoryDao categoryDao = DaoFactory.getInstance().getCategoryDao();
	
	@POST
	public Response addCategory(Category category) {
		categoryDao.addCategory(category);
		return Response.created(URI.create("/" + category.getId())).build();
	}
	
	@GET
	@Path("/{categoryId}")
	public Category getCategory(@PathParam("categoryId") Long categoryId) {
		Category category = categoryDao.getCategoryByIdWithProducts(categoryId);
		return category;
	}
	
	@GET
	public List<Category> getAllCategories() {
		List<Category> categories = categoryDao.getAllCategoriesWithProducts();
		return categories;
	}

	@PUT
	@Path("/{categoryId}")
	public void updateCategory(@PathParam("categoryId") Long categoryId, Category category) {
		if(category.getId() == categoryId) {
			categoryDao.updateCategory(category);
		} else {
			throw new WebApplicationException(400);
		}
	}

}
