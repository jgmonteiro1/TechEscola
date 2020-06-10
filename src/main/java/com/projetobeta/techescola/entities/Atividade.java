package com.projetobeta.techescola.entities;

import java.io.Serializable;

public class Atividade implements Serializable {
	
    private static final long serialVersionUID = 1L;
    
    private Long id_atividade;
    private String descricao;
    
    private Long id_disc_serie_prof;
    
    public Atividade() {
    	
    }

	public Atividade(Long id_atividade, String descricao, Long id_disc_serie_prof) {
		super();
		this.id_atividade = id_atividade;
		this.descricao = descricao;
		this.id_disc_serie_prof = id_disc_serie_prof;
	}

	public Long getId_atividade() {
		return id_atividade;
	}

	public void setId_atividade(Long id_atividade) {
		this.id_atividade = id_atividade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getId_disc_serie_prof() {
		return id_disc_serie_prof;
	}

	public void setId_disc_serie_prof(Long id_disc_serie_prof) {
		this.id_disc_serie_prof = id_disc_serie_prof;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_atividade == null) ? 0 : id_atividade.hashCode());
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
		Atividade other = (Atividade) obj;
		if (id_atividade == null) {
			if (other.id_atividade != null)
				return false;
		} else if (!id_atividade.equals(other.id_atividade))
			return false;
		return true;
	}
    
    
}
