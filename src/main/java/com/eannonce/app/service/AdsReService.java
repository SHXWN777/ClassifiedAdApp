package com.eannonce.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eannonce.app.model.AdsRealEstate;

@Service
public interface AdsReService {
	
	AdsRealEstate saveAdsRe(AdsRealEstate adsRe);
	
	List<AdsRealEstate> getAllAdsRealEstate();
	List<AdsRealEstate> listAll();
	
	AdsRealEstate getAdsRealEstateById(Long idAdsRe);
	AdsRealEstate updateAdsRe(AdsRealEstate adsRe);
	
	void deleteAdsReById(Long idAdsRe);

}
