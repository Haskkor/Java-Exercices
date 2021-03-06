package com.supinfo.supcrowdfunder.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@SuppressWarnings("serial")
@Table(name="PCATEGORIES")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Category implements Serializable{
	
	@Id	@GeneratedValue
	private long catId;

	@Column(nullable=false, unique=true)
	private String cname;	
	private String cdesc;	
	
	@XmlTransient
	@OneToMany(mappedBy="category")
	private List<Project> listProjects;

	public long getCatId() {
		return catId;
	}

	public void setCatId(long catId) {
		this.catId = catId;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String name) {
		this.cname = name;
	}

	public String getCdesc() {
		return cdesc;
	}

	public void setCdesc(String desc) {
		this.cdesc = desc;
	}

	public List<Project> getListProjects() {
		return listProjects;
	}

	public void setListProjects(List<Project> listProjects) {
		this.listProjects = listProjects;
	}
}