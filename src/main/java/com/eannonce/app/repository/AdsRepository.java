package com.eannonce.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eannonce.app.model.Ads;

public interface AdsRepository extends JpaRepository<Ads, Long> {

}
