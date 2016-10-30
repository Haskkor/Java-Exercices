package com.supinfo.supcommerce.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.supinfo.supcommerce.dao.CategoryDao;
import com.supinfo.supcommerce.dao.DaoFactory;
import com.supinfo.supcommerce.entity.Category;

@WebServlet("/auth/addCategory")
public class AddCategoryServlet extends HttpServlet {
	
	private CategoryDao categoryDao;
	
	@Override
	public void init() throws ServletException {
		categoryDao = DaoFactory.getInstance().getCategoryDao();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		req.getRequestDispatcher("/auth/addCategory.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String nameParam = req.getParameter("name");

		categoryDao.addCategory(new Category(nameParam));
		
		resp.sendRedirect(getServletContext().getContextPath());
	}

}
