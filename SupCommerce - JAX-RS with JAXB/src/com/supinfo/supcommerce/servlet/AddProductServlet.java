package com.supinfo.supcommerce.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.supinfo.supcommerce.dao.CategoryDao;
import com.supinfo.supcommerce.dao.DaoFactory;
import com.supinfo.supcommerce.dao.ProductDao;
import com.supinfo.supcommerce.entity.Category;
import com.supinfo.supcommerce.entity.Product;

@WebServlet("/auth/addProduct")
public class AddProductServlet extends HttpServlet {

	private ProductDao productDao;
	private CategoryDao categoryDao;

	@Override
	public void init() throws ServletException {
		productDao = DaoFactory.getInstance().getProductDao();
		categoryDao = DaoFactory.getInstance().getCategoryDao();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		List<Category> categories = categoryDao.getAllCategories();
		req.setAttribute("categories", categories);
		req.getRequestDispatcher("/auth/addProduct.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String nameParam = req.getParameter("name");
		String contentParam = req.getParameter("content");
		String priceParam = req.getParameter("price");
		String categoryIdParam = req.getParameter("categoryId");
		BigDecimal price = new BigDecimal(priceParam);

		Product product = new Product();
		product.setName(nameParam);
		product.setDescription(contentParam);
		product.setPrice(price);
		
		if(categoryIdParam != null && !categoryIdParam.isEmpty()) {
			Long categoryId = Long.valueOf(categoryIdParam);
			Category category = categoryDao.getCategoryById(categoryId);
			product.setCategory(category);
		}
		
		productDao.addProduct(product);
		
		resp.sendRedirect(getServletContext().getContextPath() + "/showProduct?id=" + product.getId());
	}

}
