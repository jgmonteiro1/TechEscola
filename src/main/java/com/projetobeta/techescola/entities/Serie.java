package com.projetobeta.techescola.entities;

import java.io.Serializable;

public class Serie implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	private Long id_serie;
	
	private String descricao;
	
	public Serie() {
		
	}

	public Serie(Long id_serie, String descricao) {
		super();
		this.id_serie = id_serie;
		this.descricao = descricao;
	}

	public Long getId_serie() {
		return id_serie;
	}

	public void setId_serie(Long id_serie) {
		this.id_serie = id_serie;
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
		result = prime * result + ((id_serie == null) ? 0 : id_serie.hashCode());
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
		Serie other = (Serie) obj;
		if (id_serie == null) {
			if (other.id_serie != null)
				return false;
		} else if (!id_serie.equals(other.id_serie))
			return false;
		return true;
	}
	
	
}
