package com.eannonce.app.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ads")
public class Ads {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)	
	private Long idAds;
	private String title;
	private String location;
	private String pictures;
	private Float price;
	private String description;
	//private Date dtCreation;
	//private Date dtExpiration;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "ads_details",
	        joinColumns = { @JoinColumn(name = "idAds_fk") },
	        inverseJoinColumns = { @JoinColumn(name = "idUser_fk") })
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "status_fk")
	private Status status;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_fk")
	private Category category;
	
	
	
	public Long getIdAds() {
		return idAds;
	}
	public void setIdAds(Long idAds) {
		this.idAds = idAds;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPictures() {
		return pictures;
	}
	public void setPictures(String pictures) {
		this.pictures = pictures;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
//	public Date getDtCreation() {
//		return dtCreation;
//	}
//	public void setDtCreation(Date dtCreation) {
//		this.dtCreation = dtCreation;
//	}
//	public Date getDtExpiration() {
//		return dtExpiration;
//	}
//	public void setDtExpiration(Date dtExpiration) {
//		this.dtExpiration = dtExpiration;
//	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	

}
