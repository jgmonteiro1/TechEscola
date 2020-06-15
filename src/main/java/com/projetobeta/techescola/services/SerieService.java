package com.projetobeta.techescola.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetobeta.techescola.entities.Serie;
import com.projetobeta.techescola.repositories.SerieRepository;

@Service
public class SerieService {
	
	@Autowired
	private SerieRepository repository;
	
	public List<Serie> findAll(){
		List<Serie> list = repository.findAll();
		return list;
	}
	
	public Serie novaSerie(Serie obj) {
		return repository.save(obj);
	}
	
}
