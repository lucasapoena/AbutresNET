package br.com.abutres.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Sede implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@javax.validation.constraints.NotEmpty(message = "O campo nome não pode ser vazio!")
	private String nome;
	
	private Membro diretor;
	
	private Membro subDiretor;
	
	private String endereco;
	
	private String telefone;
	
	private Sede sedeMae;

	public Sede() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Membro getDiretor() {
		return diretor;
	}

	public void setDiretor(Membro diretor) {
		this.diretor = diretor;
	}

	public Membro getSubDiretor() {
		return subDiretor;
	}

	public void setSubDiretor(Membro subDiretor) {
		this.subDiretor = subDiretor;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Sede getSedeMae() {
		return sedeMae;
	}

	public void setSedeMae(Sede sedeMae) {
		this.sedeMae = sedeMae;
	}

}
