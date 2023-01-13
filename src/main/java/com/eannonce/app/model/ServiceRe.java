package com.eannonce.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "serviceRe")
public class ServiceRe {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idServRe;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "serviceRe")
	private AdsRealEstate adsRE;	
	
	
	public Long getIdServRe() {
		return idServRe;
	}
	public void setIdServRe(Long idServRe) {
		this.idServRe = idServRe;
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
