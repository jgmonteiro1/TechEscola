package com.projetobeta.techescola.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.projetobeta.techescola.entities.CadastroProfessor;
import com.projetobeta.techescola.entities.dto.ProfessorDTO;
import com.projetobeta.techescola.services.CadastroProfessorService;

@RestController
@RequestMapping(value = "/professores")
public class CadastroProfessorResource {
	
	@Autowired
	private CadastroProfessorService service;
	
	
	@GetMapping
	private ResponseEntity<List<ProfessorDTO>> findAll(){
		List<CadastroProfessor> list = service.findAll();
		//Transformando minha list de CadastroProfessor em uma lista(listaDTO) de ProfessorDTO
		List<ProfessorDTO> listaDTO = list.stream().map(x -> new ProfessorDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listaDTO);
	}
	
	
	@GetMapping(value = "/{id}")
	private ResponseEntity<CadastroProfessor> findById(@PathVariable Long id){
		CadastroProfessor obj = service.findBYId(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	private ResponseEntity<CadastroProfessor> novoProfessor(@RequestBody CadastroProfessor obj){
		obj = service.novoProfessor(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId_professor()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
}
