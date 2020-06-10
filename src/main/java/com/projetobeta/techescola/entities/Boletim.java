package com.projetobeta.techescola.entities;

import java.io.Serializable;
import java.util.Date;

public class Boletim implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	private Long id_boletim;
	
	private Double media;
	private Date ano;
	
	public Boletim() {
		
	}

	public Boletim(Long id_boletim, Double media, Date ano) {
		super();
		this.id_boletim = id_boletim;
		this.media = media;
		this.ano = ano;
	}

	public Long getId_boletim() {
		return id_boletim;
	}

	public void setId_boletim(Long id_boletim) {
		this.id_boletim = id_boletim;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public Date getAno() {
		return ano;
	}

	public void setAno(Date ano) {
		this.ano = ano;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_boletim == null) ? 0 : id_boletim.hashCode());
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
		Boletim other = (Boletim) obj;
		if (id_boletim == null) {
			if (other.id_boletim != null)
				return false;
		} else if (!id_boletim.equals(other.id_boletim))
			return false;
		return true;
	}
	
	
}
