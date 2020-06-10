package com.projetobeta.techescola.entities;

import java.io.Serializable;

public class Conteudo implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
    private Long id;
    
    private String assunto;
    private String descricao;
    
    private Integer id_disc_serie_prof;
    
    public Conteudo() {
    	
    }

	public Conteudo(Long id, String assunto, String descricao, Integer id_disc_serie_prof) {
		super();
		this.id = id;
		this.assunto = assunto;
		this.descricao = descricao;
		this.id_disc_serie_prof = id_disc_serie_prof;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getId_disc_serie_prof() {
		return id_disc_serie_prof;
	}

	public void setId_disc_serie_prof(Integer id_disc_serie_prof) {
		this.id_disc_serie_prof = id_disc_serie_prof;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Conteudo other = (Conteudo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
    
    
	
}
