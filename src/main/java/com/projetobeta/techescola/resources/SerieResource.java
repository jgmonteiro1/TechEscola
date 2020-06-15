package com.projetobeta.techescola.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetobeta.techescola.entities.Serie;
import com.projetobeta.techescola.services.SerieService;

@RestController
@RequestMapping( value = "/series")
public class SerieResource {
		
	@Autowired
	private SerieService service;
	
	@GetMapping
	public ResponseEntity<List<Serie>> findAll(){
		List<Serie> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<Serie> novaSerie(@RequestBody Serie obj){
		obj = service.novaSerie(obj);
		return ResponseEntity.ok().body(obj);
	}
}
