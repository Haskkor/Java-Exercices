

import java.net.URI;
import java.util.List;

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
	
	public Response addCategory(Category category) {
		categoryDao.addCategory(category);
		return Response.created(URI.create("/" + category.getId())).build();
	}
	
	@Path("/{categoryId}")
	public Category getCategory(@PathParam("categoryId") Long categoryId) {
		Category category = categoryDao.getCategoryByIdWithProducts(categoryId);
		return category;
	}
	
	public List<Category> getAllCategories() {
		List<Category> categories = categoryDao.getAllCategories();
		return categories;
	}

	@Path("/{categoryId}")
	public void updateCategory(@PathParam("categoryId") Long categoryId, Category category) {
		if(category.getId() == categoryId) {
			categoryDao.updateCategory(category);
		} else {
			throw new WebApplicationException(400);
		}
	}

}
