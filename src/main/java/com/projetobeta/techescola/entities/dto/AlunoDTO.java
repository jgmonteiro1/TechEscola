package com.projetobeta.techescola.entities.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.projetobeta.techescola.entities.CadastroAluno;

public class AlunoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@NotEmpty(message = "Preenchimento do campo obrigatório")
	private String nome;
	
	@NotEmpty(message = "Preenchimento do campo obrigatório")
	@Email
	private String email;
	private String escola;
	private String matricula;
	//
	public AlunoDTO() {
		
	}
	
	public AlunoDTO(CadastroAluno obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.email = obj.getEmail();
		this.escola = obj.getEscola();
		this.matricula = obj.getMatricula();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

}
