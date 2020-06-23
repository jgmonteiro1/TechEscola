package com.projetobeta.techescola.entities.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.projetobeta.techescola.entities.CadastroProfessor;

public class ProfessorDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id_professor;
	
	@NotEmpty(message ="Preenchimento do campo obrigatório")
	private String nome;
	
	@NotEmpty(message = "Preenchimento do campo obrigatório")
	@Email(message = "O valor do campo deve conter um e-mail")
	private String email;
	
	public ProfessorDTO() {
		
	}
	
	public ProfessorDTO(CadastroProfessor obj) {
		this.id_professor = obj.getId_professor();
		this.nome = obj.getNome();
		this.email = obj.getEmail();
	}

	public Long getId_professor() {
		return id_professor;
	}

	public void setId_professor(Long id_professor) {
		this.id_professor = id_professor;
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
		
	
}
