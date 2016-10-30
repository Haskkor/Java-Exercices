package com.supinfo.supcommerce.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.supinfo.supcommerce.dao.DaoFactory;
import com.supinfo.supcommerce.dao.ProductDao;
import com.supinfo.supcommerce.entity.Product;

@WebServlet("/showProduct")
public class ShowProductServlet extends HttpServlet {
	
	private ProductDao productDao;
	
	@Override
	public void init() throws ServletException {
		productDao = DaoFactory.getInstance().getProductDao();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String productIdParam = req.getParameter("id");
		Long productId = Long.valueOf(productIdParam);
		
		Product product = productDao.getProductById(productId);
		
		req.setAttribute("product", product);
		req.getRequestDispatcher("/showProduct.jsp").forward(req, resp);
	}

}
