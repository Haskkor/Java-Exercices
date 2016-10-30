package com.supinfo.supcommerce.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.supinfo.supcommerce.dao.ProductDao;
import com.supinfo.supcommerce.entity.Product;

public class JpaProductDao implements ProductDao {

	private EntityManagerFactory emf;
	
	
	public JpaProductDao(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	@Override
	public Product addProduct(Product product) {
		Product result = null;
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(product);
			em.getTransaction().commit();
			result = product;
		} finally {
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			em.close();
		}
		return result;
	}

	@Override
	public Product getProductById(Long productId) {
		EntityManager em = emf.createEntityManager();
		try {
			return em.find(Product.class, productId);
		} finally {
			em.close();
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts() {
		EntityManager em = emf.createEntityManager();
		try {
			Query query = em.createQuery("SELECT p FROM Product p");
			return query.getResultList();
		} finally {
			em.close();
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Product> getCheaperProducts() {
		EntityManager em = emf.createEntityManager();
		try {
			Query query = em.createQuery("SELECT p FROM Product p WHERE p.price < 100");
			return query.getResultList();
		} finally {
			em.close();
		}
	}

	@Override
	public void removeProduct(Long productId) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			
			em.createQuery("DELETE FROM Product p WHERE p.id = :productId")
				.setParameter("productId", productId)
				.executeUpdate();
			
			em.getTransaction().commit();
		} finally {
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			em.close();
		}
	}

	@Override
	public void removeProduct(Product product) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.remove(em.merge(product));
			em.getTransaction().commit();
		} finally {
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			em.close();
		}
	}

}
