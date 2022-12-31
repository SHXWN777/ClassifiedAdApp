package com.eannonce.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eannonce.app.model.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {

}
