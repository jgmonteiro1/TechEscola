package com.projetobeta.techescola.entities;

import java.io.Serializable;

public class TelefoneProfessor implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	private Long id_telefone;
	
	private String numero;
	
	private Long id_professor;
	
	public TelefoneProfessor() {
		
	}

	public TelefoneProfessor(Long id_telefone, String numero, Long id_professor) {
		super();
		this.id_telefone = id_telefone;
		this.numero = numero;
		this.id_professor = id_professor;
	}

	public Long getId_telefone() {
		return id_telefone;
	}

	public void setId_telefone(Long id_telefone) {
		this.id_telefone = id_telefone;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
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
		result = prime * result + ((id_telefone == null) ? 0 : id_telefone.hashCode());
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
		TelefoneProfessor other = (TelefoneProfessor) obj;
		if (id_telefone == null) {
			if (other.id_telefone != null)
				return false;
		} else if (!id_telefone.equals(other.id_telefone))
			return false;
		return true;
	}
	
	
}
