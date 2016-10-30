package com.supinfo.supcommerce.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.supinfo.supcommerce.dao.DaoFactory;
import com.supinfo.supcommerce.dao.ProductDao;
import com.supinfo.supcommerce.entity.Product;

@Path("/products")
public class ProductResource {
	
	private ProductDao productDao = DaoFactory.getInstance().getProductDao();
	
	@GET
	public List<Product> getAllProductsInXml() {
		List<Product> products = productDao.getAllProducts();
		return products;
	}
	
	@GET
	@Path("/{productId}")
	public Product getProductInXml(@PathParam("productId") Long productId) {
		Product product = productDao.getProductById(productId);
		return product;
	}
	
	@DELETE
	@Path("/{productId}")
	public void removeProduct(@PathParam("productId") Long productId) {
		productDao.removeProduct(productId);
	}
	
}
