package com.projetobeta.techescola.entities;

import java.io.Serializable;

public class TelefoneAluno implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	private Long id_telefone;
	
	private String numero;
	
	private Long id_aluno;
	
	public TelefoneAluno() {
		
	}

	public TelefoneAluno(Long id_telefone, String numero, Long id_aluno) {
		super();
		this.id_telefone = id_telefone;
		this.numero = numero;
		this.id_aluno = id_aluno;
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

	public Long getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(Long id_aluno) {
		this.id_aluno = id_aluno;
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
		TelefoneAluno other = (TelefoneAluno) obj;
		if (id_telefone == null) {
			if (other.id_telefone != null)
				return false;
		} else if (!id_telefone.equals(other.id_telefone))
			return false;
		return true;
	}
	
	
}
