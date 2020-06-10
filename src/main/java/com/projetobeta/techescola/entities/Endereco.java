package com.projetobeta.techescola.entities;

import java.io.Serializable;

public class Endereco implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	private Long id_endereco;
	
	private String cep;
	private String logradouro;
	private String bairro;
	private Integer numero;
	
	private Long id_municipio;
	
	public Endereco() {
		
	}

	public Endereco(Long id_endereco, String cep, String logradouro, String bairro, Integer numero, Long id_municipio) {
		super();
		this.id_endereco = id_endereco;
		this.cep = cep;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.numero = numero;
		this.id_municipio = id_municipio;
	}

	public Long getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(Long id_endereco) {
		this.id_endereco = id_endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Long getId_municipio() {
		return id_municipio;
	}

	public void setId_municipio(Long id_municipio) {
		this.id_municipio = id_municipio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_municipio == null) ? 0 : id_municipio.hashCode());
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
		Endereco other = (Endereco) obj;
		if (id_municipio == null) {
			if (other.id_municipio != null)
				return false;
		} else if (!id_municipio.equals(other.id_municipio))
			return false;
		return true;
	}
	
	
}
