package com.eannonce.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idCategory;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "category")
	private Ads ads;
	
	
	
	public Long getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Ads getAds() {
		return ads;
	}
	public void setAds(Ads ads) {
		this.ads = ads;
	}
	
	
}
