package com.projetobeta.techescola.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_disciplinas")
public class Disciplinas implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_disciplinas;
	
	private String descricao;
	
	@JsonIgnore
	@ManyToMany(mappedBy="disciplinas")
	private Set<CadastroProfessor> professores = new HashSet<>();
	
	public Disciplinas() {
		
	}

	public Disciplinas(Long id_disciplinas, String descricao) {
		super();
		this.id_disciplinas = id_disciplinas;
		this.descricao = descricao;
	}

	public Long getId_disciplinas() {
		return id_disciplinas;
	}

	public void setId_disciplinas(Long id_disciplinas) {
		this.id_disciplinas = id_disciplinas;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

	public Set<CadastroProfessor> getProfessores() {
		return professores;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_disciplinas == null) ? 0 : id_disciplinas.hashCode());
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
		Disciplinas other = (Disciplinas) obj;
		if (id_disciplinas == null) {
			if (other.id_disciplinas != null)
				return false;
		} else if (!id_disciplinas.equals(other.id_disciplinas))
			return false;
		return true;
	}
	
	
}
