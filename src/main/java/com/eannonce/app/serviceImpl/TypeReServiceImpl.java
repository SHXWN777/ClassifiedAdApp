package com.eannonce.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eannonce.app.model.TypeRe;
import com.eannonce.app.repository.TypeReRepository;
import com.eannonce.app.service.TypeReService;

@Service
public class TypeReServiceImpl implements TypeReService {
	
	@Autowired
	private TypeReRepository typeReRepository;

	@Override
	public TypeRe saveTypeRe(TypeRe typeRe) {
		return typeReRepository.save(typeRe);
	}

	@Override
	public List<TypeRe> getAllTypeRes() {
		return typeReRepository.findAll();
	}

}
