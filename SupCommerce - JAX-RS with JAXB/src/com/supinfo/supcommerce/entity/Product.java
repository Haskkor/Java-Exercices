package com.supinfo.supcommerce.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@XmlRootElement
public class Product implements Serializable {
	
	@Id @GeneratedValue
	private Long id;
	
	@Column(nullable=false, unique=true)
	private String name;
	
	@Lob
	private String description;
	
	// BigDecimal have a better precision than a float or a double.
	// It is the perfect type for a price.
	private BigDecimal price;
	
	@ManyToOne
	@JoinColumn
	private Category category;
	
	
	public Product() {
		
	}

	public Product(String name, String description, BigDecimal price, Category category) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	@XmlTransient
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}

}
