package com.projetobeta.techescola.entities;

import java.io.Serializable;
import java.util.Date;

public class EntregaAvaliacao implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	private Long id_entrega_avaliacao;
	
	private Long id_avaliacao;
	
	private Date data_entrega;
	
	private Long id_aluno;
	
	public EntregaAvaliacao() {
		
	}

	public EntregaAvaliacao(Long id_entrega_avaliacao, Long id_avaliacao, Date data_entrega, Long id_aluno) {
		super();
		this.id_entrega_avaliacao = id_entrega_avaliacao;
		this.id_avaliacao = id_avaliacao;
		this.data_entrega = data_entrega;
		this.id_aluno = id_aluno;
	}

	public Long getId_entrega_avaliacao() {
		return id_entrega_avaliacao;
	}

	public void setId_entrega_avaliacao(Long id_entrega_avaliacao) {
		this.id_entrega_avaliacao = id_entrega_avaliacao;
	}

	public Long getId_avaliacao() {
		return id_avaliacao;
	}

	public void setId_avaliacao(Long id_avaliacao) {
		this.id_avaliacao = id_avaliacao;
	}

	public Date getData_entrega() {
		return data_entrega;
	}

	public void setData_entrega(Date data_entrega) {
		this.data_entrega = data_entrega;
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
		result = prime * result + ((id_entrega_avaliacao == null) ? 0 : id_entrega_avaliacao.hashCode());
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
		EntregaAvaliacao other = (EntregaAvaliacao) obj;
		if (id_entrega_avaliacao == null) {
			if (other.id_entrega_avaliacao != null)
				return false;
		} else if (!id_entrega_avaliacao.equals(other.id_entrega_avaliacao))
			return false;
		return true;
	}
	
	
}
