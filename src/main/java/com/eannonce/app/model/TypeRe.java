package com.eannonce.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "typeRe" )
public class TypeRe {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idTypeRe;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "TypeRe")
	private AdsRealEstate adsRE;
	
	
	public Long getIdTypeRe() {
		return idTypeRe;
	}
	public void setIdTypeRe(Long idTypeRe) {
		this.idTypeRe = idTypeRe;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AdsRealEstate getAdsRE() {
		return adsRE;
	}
	public void setAdsRE(AdsRealEstate adsRE) {
		this.adsRE = adsRE;
	}
	
}
