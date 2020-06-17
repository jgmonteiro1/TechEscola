package com.projetobeta.techescola.entities;

import java.io.Serializable;





public class DisciplinaSerieProfessor implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	private Long id_disc_serie_prof;
	
   
    
	private Long id_disc_serie;
	private Long id_professor;
	
	public DisciplinaSerieProfessor() {
		
	}

	public DisciplinaSerieProfessor(Long id_disc_serie_prof, Long id_disc_serie, Long id_professor) {
		super();
		this.id_disc_serie_prof = id_disc_serie_prof;
		this.id_disc_serie = id_disc_serie;
		this.id_professor = id_professor;
	}

	public Long getId_disc_serie_prof() {
		return id_disc_serie_prof;
	}

	public void setId_disc_serie_prof(Long id_disc_serie_prof) {
		this.id_disc_serie_prof = id_disc_serie_prof;
	}

	public Long getId_disc_serie() {
		return id_disc_serie;
	}

	public void setId_disc_serie(Long id_disc_serie) {
		this.id_disc_serie = id_disc_serie;
	}

	public Long getId_professor() {
		return id_professor;
	}

	public void setId_professor(Long id_professor) {
		this.id_professor = id_professor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_disc_serie_prof == null) ? 0 : id_disc_serie_prof.hashCode());
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
		DisciplinaSerieProfessor other = (DisciplinaSerieProfessor) obj;
		if (id_disc_serie_prof == null) {
			if (other.id_disc_serie_prof != null)
				return false;
		} else if (!id_disc_serie_prof.equals(other.id_disc_serie_prof))
			return false;
		return true;
	}
	
	
}
