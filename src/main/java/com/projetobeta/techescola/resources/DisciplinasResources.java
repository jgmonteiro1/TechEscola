package com.projetobeta.techescola.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.projetobeta.techescola.entities.Disciplinas;
import com.projetobeta.techescola.services.DisciplinasServices;

@RestController
@RequestMapping(value = "/disciplinas")
public class DisciplinasResources {
	
	@Autowired
	private DisciplinasServices service;
	
	@GetMapping
	public ResponseEntity<List<Disciplinas>> findAll(){
		List<Disciplinas> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<Disciplinas> novaDisciplina(@RequestBody Disciplinas obj){
		obj = service.novaDisciplina(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId_disciplinas()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
}
