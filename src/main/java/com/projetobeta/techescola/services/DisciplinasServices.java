package com.projetobeta.techescola.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetobeta.techescola.entities.Disciplinas;
import com.projetobeta.techescola.repositories.DisciplinasRepository;

@Service
public class DisciplinasServices {
	
	@Autowired
	private DisciplinasRepository repository;
	
	public Disciplinas novaDisciplina(Disciplinas obj) {
		return repository.save(obj);
	}
	
	public List<Disciplinas> findAll(){
		List<Disciplinas> list = repository.findAll();
		return list;
	}
}
