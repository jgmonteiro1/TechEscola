package com.projetobeta.techescola.entities;

import java.io.Serializable;

public class Notas implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
    private Long id_notas;
    
    private Long id_aluno;
    private Long id_avaliacao;
    
    public Notas() {
    	
    }

	public Notas(Long id_notas, Long id_aluno, Long id_avaliacao) {
		super();
		this.id_notas = id_notas;
		this.id_aluno = id_aluno;
		this.id_avaliacao = id_avaliacao;
	}

	public Long getId_notas() {
		return id_notas;
	}

	public void setId_notas(Long id_notas) {
		this.id_notas = id_notas;
	}

	public Long getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(Long id_aluno) {
		this.id_aluno = id_aluno;
	}

	public Long getId_avaliacao() {
		return id_avaliacao;
	}

	public void setId_avaliacao(Long id_avaliacao) {
		this.id_avaliacao = id_avaliacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_notas == null) ? 0 : id_notas.hashCode());
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
		Notas other = (Notas) obj;
		if (id_notas == null) {
			if (other.id_notas != null)
				return false;
		} else if (!id_notas.equals(other.id_notas))
			return false;
		return true;
	}
    
    
	
}
