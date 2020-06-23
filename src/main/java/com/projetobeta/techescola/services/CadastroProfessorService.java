package com.projetobeta.techescola.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetobeta.techescola.entities.CadastroProfessor;
import com.projetobeta.techescola.entities.dto.ProfessorDTO;
import com.projetobeta.techescola.repositories.CadastroProfessorRepository;

@Service
public class CadastroProfessorService  {
	
	@Autowired
	private CadastroProfessorRepository repository;
	
	
	public List<CadastroProfessor> findAll(){
		List<CadastroProfessor> list = repository.findAll();
		return list;
	}
	
	public CadastroProfessor findBYId(Long id) {
		Optional<CadastroProfessor> obj = repository.findById(id);
		return obj.get();
	}
	
	public CadastroProfessor novoProfessor(CadastroProfessor obj) {
		return repository.save(obj);
	}
	
	public CadastroProfessor converteEmDTO(ProfessorDTO obj) {
		return new CadastroProfessor(obj.getId_professor(), obj.getNome(), obj.getEmail(), null, null);
	}
	
	
}
