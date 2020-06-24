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

import com.projetobeta.techescola.entities.CadastroAluno;
import com.projetobeta.techescola.entities.dto.AlunoDTO;
import com.projetobeta.techescola.services.CadastroAlunoService;

@RestController
@RequestMapping(value= "/alunos")
public class CadastroAlunoResource {
	
	@Autowired
	private CadastroAlunoService service;
	
	@GetMapping
	public ResponseEntity<List<AlunoDTO>> findAll(){
		List<CadastroAluno> list = service.findAll();
		List<AlunoDTO> listaDTO = list.stream().map(x -> new AlunoDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listaDTO);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CadastroAluno> findById(@PathVariable Long id){
		CadastroAluno obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<CadastroAluno> novoAluno(@RequestBody CadastroAluno obj){
		obj = service.novoAluno(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
}
