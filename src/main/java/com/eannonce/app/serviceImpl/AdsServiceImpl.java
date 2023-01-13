package com.eannonce.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eannonce.app.model.Ads;
import com.eannonce.app.repository.AdsRepository;
import com.eannonce.app.service.AdsService;

@Service
public class AdsServiceImpl implements AdsService{
	
	@Autowired
	private AdsRepository adsRepository;

	@Override
	public Ads saveAds(Ads ads) {
		return adsRepository.save(ads);
	}

	@Override
	public List<Ads> getAllAds() {
		return adsRepository.findAll();
	}

	@Override
	public List<Ads> listAll() {
		return adsRepository.findAll();
	}

	@Override
	public Ads getAdsById(Long idAds) {
		return adsRepository.findById(idAds).get();	
	}

	@Override
	public Ads updateAds(Ads ads) {
		return null;
	}

	@Override
	public void deleteAdsById(long idAds) {
		adsRepository.deleteById(idAds);
	}

	
}
