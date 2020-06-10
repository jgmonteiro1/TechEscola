package com.projetobeta.techescola.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetobeta.techescola.entities.CadastroAluno;
import com.projetobeta.techescola.repositories.CadastroAlunoRepository;

@Service
public class CadastroAlunoService {
	
	@Autowired
	private CadastroAlunoRepository repository;
	
	public List<CadastroAluno> findAll(){
		return repository.findAll();
	}
	
	public CadastroAluno findById(Long id) {
		Optional<CadastroAluno> obj = repository.findById(id);
		return obj.get();
	}
}
