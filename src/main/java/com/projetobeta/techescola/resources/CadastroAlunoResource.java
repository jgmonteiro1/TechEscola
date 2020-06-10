package com.projetobeta.techescola.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetobeta.techescola.entities.CadastroAluno;
import com.projetobeta.techescola.services.CadastroAlunoService;

@RestController
@RequestMapping(value= "/alunos")
public class CadastroAlunoResource {
	
	@Autowired
	private CadastroAlunoService service;
	
	@GetMapping
	public ResponseEntity<List<CadastroAluno>> findAll(){
		List<CadastroAluno> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CadastroAluno> findById(@PathVariable Long id){
		CadastroAluno obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
