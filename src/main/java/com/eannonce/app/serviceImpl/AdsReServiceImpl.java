package com.eannonce.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eannonce.app.model.AdsRealEstate;
import com.eannonce.app.repository.AdsReRepository;
import com.eannonce.app.service.AdsReService;

@Service
public class AdsReServiceImpl implements AdsReService{
	
	@Autowired
	private AdsReRepository adsReRepository;

	@Override
	public AdsRealEstate saveAdsRe(AdsRealEstate adsRe) {
		return adsReRepository.save(adsRe);
	}

	@Override
	public List<AdsRealEstate> getAllAdsRealEstate() {
		return adsReRepository.findAll();
	}

	@Override
	public List<AdsRealEstate> listAll() {
		return adsReRepository.findAll();
	}

	@Override
	public AdsRealEstate getAdsRealEstateById(Long idAdsRe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdsRealEstate updateAdsRe(AdsRealEstate adsRe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAdsReById(Long idAdsRe) {
		adsReRepository.deleteById(idAdsRe);		
	}

}
