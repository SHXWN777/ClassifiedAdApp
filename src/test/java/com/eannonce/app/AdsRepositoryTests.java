//package com.eannonce.app;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.annotation.Rollback;
//
//import com.eannonce.app.model.Ads;
//import com.eannonce.app.repository.AdsRepository;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = Replace.NONE)
//@Rollback(false)
//public class AdsRepositoryTests {
//	
//	@Autowired
//	private AdsRepository adsRepository;
//	
//	@Autowired
//	private TestEntityManager entityManager;
//	
//	@Test
//	public void testCreateAds() {
//		Ads ads = new Ads();		
//		ads.setTitle("Villa de joie");
//		ads.setDescription("Bienvenue");
//        ads.setPrice("10");
//        ads.setPictures("null");
//		
//		Ads savedAds = adsRepository.save(ads);
//		
//		Ads existAds = entityManager.find(Ads.class, savedAds.getIdAds());
//		
//		assertThat(existAds.getTitle()).isEqualTo(ads.getTitle());
//	}
//
//
//}
