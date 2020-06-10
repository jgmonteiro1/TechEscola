package com.projetobeta.techescola.entities;

import java.io.Serializable;

public class DisciplinaSerie implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	private Long id_disciplina_serie;
	
	private Long id_disciplina;
	private Long id_serie;
	
	
	public DisciplinaSerie() {
		
	}


	public DisciplinaSerie(Long id_disciplina_serie, Long id_disciplina, Long id_serie) {
		super();
		this.id_disciplina_serie = id_disciplina_serie;
		this.id_disciplina = id_disciplina;
		this.id_serie = id_serie;
	}


	public Long getId_disciplina_serie() {
		return id_disciplina_serie;
	}


	public void setId_disciplina_serie(Long id_disciplina_serie) {
		this.id_disciplina_serie = id_disciplina_serie;
	}


	public Long getId_disciplina() {
		return id_disciplina;
	}


	public void setId_disciplina(Long id_disciplina) {
		this.id_disciplina = id_disciplina;
	}


	public Long getId_serie() {
		return id_serie;
	}


	public void setId_serie(Long id_serie) {
		this.id_serie = id_serie;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_disciplina_serie == null) ? 0 : id_disciplina_serie.hashCode());
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
		DisciplinaSerie other = (DisciplinaSerie) obj;
		if (id_disciplina_serie == null) {
			if (other.id_disciplina_serie != null)
				return false;
		} else if (!id_disciplina_serie.equals(other.id_disciplina_serie))
			return false;
		return true;
	}
	
	
}
