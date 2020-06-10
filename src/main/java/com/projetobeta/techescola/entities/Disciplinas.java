package com.projetobeta.techescola.entities;

import java.io.Serializable;

public class Disciplinas implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	private Long id_disciplinas;
	
	private String descricao;
	
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
