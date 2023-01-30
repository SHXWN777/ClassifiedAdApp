package com.eannonce.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eannonce.app.model.TypeRe;

@Service
public interface TypeReService {
	
	TypeRe saveTypeRe(TypeRe typeRe);
	
	List<TypeRe> getAllTypeRes();

}
