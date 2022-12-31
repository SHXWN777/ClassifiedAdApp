package com.eannonce.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "adsRealEstate")
public class AdsRealEstate {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idAdsRe;
	private String address;
	private Double surface;
	private Long nbrPiece;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_serv_re_id")
	private ServiceRe serviceRe;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_type_re_id")
	private TypeRe TypeRe;
	
	public Long getIdAdsRe() {
		return idAdsRe;
	}
	public void setIdAdsRe(Long idAdsRe) {
		this.idAdsRe = idAdsRe;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getSurface() {
		return surface;
	}
	public void setSurface(Double surface) {
		this.surface = surface;
	}
	public Long getNbrPiece() {
		return nbrPiece;
	}
	public void setNbrPiece(Long nbrPiece) {
		this.nbrPiece = nbrPiece;
	}
	public ServiceRe getServiceRe() {
		return serviceRe;
	}
	public void setServiceRe(ServiceRe serviceRe) {
		this.serviceRe = serviceRe;
	}
	public TypeRe getTypeRe() {
		return TypeRe;
	}
	public void setTypeRe(TypeRe typeRe) {
		TypeRe = typeRe;
	}
	

}
