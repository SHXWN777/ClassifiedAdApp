package com.eannonce.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eannonce.app.model.Ads;

@Service
public interface AdsService {
	
	Ads saveAds(Ads ads);
	
	List<Ads> getAllAds();
	List<Ads> listAll();
	
	Ads getAdsById(Long idAds);
	Ads updateAds(Ads ads);
	
	void deleteAdsById(long idAds);

}
