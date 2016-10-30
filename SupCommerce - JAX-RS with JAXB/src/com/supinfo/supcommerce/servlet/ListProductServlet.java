package com.supinfo.supcommerce.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.supinfo.supcommerce.dao.DaoFactory;
import com.supinfo.supcommerce.dao.ProductDao;
import com.supinfo.supcommerce.entity.Product;

@WebServlet("/listProduct")
public class ListProductServlet extends HttpServlet {

	private ProductDao productDao;

	@Override
	public void init() throws ServletException {
		productDao = DaoFactory.getInstance().getProductDao();
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> products = productDao.getAllProducts();
		request.setAttribute("products", products);
		request.getRequestDispatcher("/listProduct.jsp").forward(request, response);
	}

}
