package com.projetobeta.techescola.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetobeta.techescola.entities.CadastroProfessor;
import com.projetobeta.techescola.services.CadastroProfessorService;

@RestController
@RequestMapping(value = "/professores")
public class CadastroProfessorResource {
	
	@Autowired
	private CadastroProfessorService service;
	
	
	@GetMapping
	private ResponseEntity<List<CadastroProfessor>> findAll(){
		List<CadastroProfessor> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	private ResponseEntity<CadastroProfessor> findById(@PathVariable Long id){
		CadastroProfessor obj = service.findBYId(id);
		return ResponseEntity.ok().body(obj);
	}
}
