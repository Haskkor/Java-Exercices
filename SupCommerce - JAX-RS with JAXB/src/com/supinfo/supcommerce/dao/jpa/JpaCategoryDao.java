package com.supinfo.supcommerce.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.supinfo.supcommerce.dao.CategoryDao;
import com.supinfo.supcommerce.entity.Category;

public class JpaCategoryDao implements CategoryDao {

	private EntityManagerFactory emf;


	public JpaCategoryDao(EntityManagerFactory emf) {
		this.emf = emf;
	}

	@Override
	public Category addCategory(Category category) {
		Category result = null;
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(category);
			em.getTransaction().commit();
			result = category;
		} finally {
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			em.close();
		}
		return result;
	}

	@Override
	public Category getCategoryById(Long categoryId) {
		EntityManager em = emf.createEntityManager();
		try {
			return em.find(Category.class, categoryId);
		} finally {
			em.close();
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Category> getAllCategories() {
		EntityManager em = emf.createEntityManager();
		try {
			Query query = em.createQuery("SELECT c FROM Category c");
			return query.getResultList();
		} finally {
			em.close();
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Category> getAllCategoriesWithProducts() {
		EntityManager em = emf.createEntityManager();
		try {
			Query query = em.createQuery("SELECT c FROM Category c LEFT JOIN FETCH c.products");
			return query.getResultList();
		} finally {
			em.close();
		}
	}

	@Override
	public void removeCategory(Long categoryId) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			
			em.createQuery("DELETE FROM Category c WHERE c.id = :categoryId")
				.setParameter("categoryId", categoryId)
				.executeUpdate();
			
			em.getTransaction().commit();
		} finally {
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			em.close();
		}
	}

	@Override
	public void updateCategory(Category category) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(category);
			em.getTransaction().commit();
		} finally {
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			em.close();
		}
	}

	@Override
	public Category getCategoryByIdWithProducts(Long categoryId) {
		EntityManager em = emf.createEntityManager();
		try {
			Query query = em.createQuery(
					"SELECT c FROM Category c " +
					"LEFT JOIN FETCH c.products " +
					"WHERE c.id = :categoryId"
			).setParameter("categoryId", categoryId);
			return (Category) query.getSingleResult();
		} finally {
			em.close();
		}
	}

}
