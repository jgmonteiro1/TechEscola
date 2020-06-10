package com.projetobeta.techescola.entities;

import java.io.Serializable;

public class Municipio implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	private Long id_municipio;
	
	private String cidade;
	private String estado;
	
	public Municipio() {
		
	}

	public Municipio(Long id_municipio, String cidade, String estado) {
		super();
		this.id_municipio = id_municipio;
		this.cidade = cidade;
		this.estado = estado;
	}

	public Long getId_municipio() {
		return id_municipio;
	}

	public void setId_municipio(Long id_municipio) {
		this.id_municipio = id_municipio;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_municipio == null) ? 0 : id_municipio.hashCode());
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
		Municipio other = (Municipio) obj;
		if (id_municipio == null) {
			if (other.id_municipio != null)
				return false;
		} else if (!id_municipio.equals(other.id_municipio))
			return false;
		return true;
	}
	
	
}
