package com.projetobeta.techescola.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_cadastro_professor")
public class CadastroProfessor implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_professor;
    
    private String nome;
    private String email;
    private String senha;
    
    private Long id_endereco;
    
    public CadastroProfessor() {
    	
    }

	public CadastroProfessor(Long id_professor, String nome, String email, String senha, Long id_endereco) {
		super();
		this.id_professor = id_professor;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.id_endereco = id_endereco;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Long getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(Long id_endereco) {
		this.id_endereco = id_endereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_professor == null) ? 0 : id_professor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastroProfessor other = (CadastroProfessor) obj;
		if (id_professor == null) {
			if (other.id_professor != null)
				return false;
		} else if (!id_professor.equals(other.id_professor))
			return false;
		return true;
	}
    
    
	
}
