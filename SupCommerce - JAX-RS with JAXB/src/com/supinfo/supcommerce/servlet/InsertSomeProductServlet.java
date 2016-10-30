package com.supinfo.supcommerce.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.supinfo.supcommerce.dao.DaoFactory;
import com.supinfo.supcommerce.dao.ProductDao;
import com.supinfo.supcommerce.entity.Product;

@WebServlet("/auth/basicInsert")
public class InsertSomeProductServlet extends HttpServlet {
	
	private ProductDao productDao;
	
	@Override
	public void init() throws ServletException {
		productDao = DaoFactory.getInstance().getProductDao();
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		
		Product product = new Product();
		product.setName("MacBook-" + new Random().nextInt());
		product.setDescription("An Apple Laptop");
		product.setPrice(new BigDecimal("1200"));
		
		productDao.addProduct(product);
	}

}
