package com.projetobeta.techescola.entities;

import java.io.Serializable;
import java.sql.Date;

public class Avaliacao implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	private Long id_aluno;
	
	private Long id_disc_serie_prof;
	private Date data_avaliacao;
	
	public Avaliacao() {
		
	}

	public Avaliacao(Long id_aluno, Long id_disc_serie_prof, Date data_avaliacao) {
		super();
		this.id_aluno = id_aluno;
		this.id_disc_serie_prof = id_disc_serie_prof;
		this.data_avaliacao = data_avaliacao;
	}

	public Long getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(Long id_aluno) {
		this.id_aluno = id_aluno;
	}

	public Long getId_disc_serie_prof() {
		return id_disc_serie_prof;
	}

	public void setId_disc_serie_prof(Long id_disc_serie_prof) {
		this.id_disc_serie_prof = id_disc_serie_prof;
	}

	public Date getData_avaliacao() {
		return data_avaliacao;
	}

	public void setData_avaliacao(Date data_avaliacao) {
		this.data_avaliacao = data_avaliacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_aluno == null) ? 0 : id_aluno.hashCode());
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
		Avaliacao other = (Avaliacao) obj;
		if (id_aluno == null) {
			if (other.id_aluno != null)
				return false;
		} else if (!id_aluno.equals(other.id_aluno))
			return false;
		return true;
	}
	
	
}
