package br.com.abutres.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import br.com.abutres.enums.EnumStatus;

@Entity
public class Membro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "seq_membro", sequenceName = "seq_membro", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_membro")
	private Long id;

	@NotBlank
	private String nome;

	@NotBlank
	private String apelido;

	@Size(min = 10, max = 10)
	private String telefone;

	@Email
	private String email;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_nascimento")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date dataNascimento;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_admissao")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date dataAdmissao;

	@NumberFormat
	private String cnh;

	private String veiculo;

	@Embedded
	private Endereco endereco;

	@ManyToOne(cascade = CascadeType.ALL)
	private Sede sede;

	private String motoClubeItens;
	private String advertencias;
	private String punicoes;
	private String foto;
	private String ocupacao;
	private String padrinho;
	private Patente patente;
	
	@Enumerated(EnumType.STRING)
	private EnumStatus statusMembro;
	
	public Membro() {
		
	}
	
	public Membro(String nome, String apelido, @Size(min = 10, max = 10) String telefone,
			Date dataNascimento, Date dataAdmissao) {
		super();
		this.nome = nome;
		this.apelido = apelido;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.dataAdmissao = dataAdmissao;
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

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getVeiculo() {
		return veiculo;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getMotoClubeItens() {
		return motoClubeItens;
	}

	public void setMotoClubeItens(String motoClubeItens) {
		this.motoClubeItens = motoClubeItens;
	}

	public String getAdvertencias() {
		return advertencias;
	}

	public void setAdvertencias(String advertencias) {
		this.advertencias = advertencias;
	}

	public String getPunicoes() {
		return punicoes;
	}

	public void setPunicoes(String punicoes) {
		this.punicoes = punicoes;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}

	public String getPadrinho() {
		return padrinho;
	}

	public void setPadrinho(String padrinho) {
		this.padrinho = padrinho;		
	}

	public Patente getPatente() {
		return patente;
	}

	public void setPatente(Patente patente) {
		this.patente = patente;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public EnumStatus getStatusMembro() {
		if(statusMembro == null) {
			statusMembro = EnumStatus.ATIVO;
		}
		return statusMembro;
	}

	public void setStatusMembro(EnumStatus statusMembro) {
		this.statusMembro = statusMembro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((advertencias == null) ? 0 : advertencias.hashCode());
		result = prime * result + ((apelido == null) ? 0 : apelido.hashCode());
		result = prime * result + ((cnh == null) ? 0 : cnh.hashCode());
		result = prime * result + ((dataAdmissao == null) ? 0 : dataAdmissao.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((foto == null) ? 0 : foto.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((motoClubeItens == null) ? 0 : motoClubeItens.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((ocupacao == null) ? 0 : ocupacao.hashCode());
		result = prime * result + ((padrinho == null) ? 0 : padrinho.hashCode());
		result = prime * result + ((patente == null) ? 0 : patente.hashCode());
		result = prime * result + ((punicoes == null) ? 0 : punicoes.hashCode());
		result = prime * result + ((sede == null) ? 0 : sede.hashCode());
		result = prime * result + ((statusMembro == null) ? 0 : statusMembro.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		result = prime * result + ((veiculo == null) ? 0 : veiculo.hashCode());
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
		Membro other = (Membro) obj;
		if (advertencias == null) {
			if (other.advertencias != null)
				return false;
		} else if (!advertencias.equals(other.advertencias))
			return false;
		if (apelido == null) {
			if (other.apelido != null)
				return false;
		} else if (!apelido.equals(other.apelido))
			return false;
		if (cnh == null) {
			if (other.cnh != null)
				return false;
		} else if (!cnh.equals(other.cnh))
			return false;
		if (dataAdmissao == null) {
			if (other.dataAdmissao != null)
				return false;
		} else if (!dataAdmissao.equals(other.dataAdmissao))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (foto == null) {
			if (other.foto != null)
				return false;
		} else if (!foto.equals(other.foto))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (motoClubeItens == null) {
			if (other.motoClubeItens != null)
				return false;
		} else if (!motoClubeItens.equals(other.motoClubeItens))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (ocupacao == null) {
			if (other.ocupacao != null)
				return false;
		} else if (!ocupacao.equals(other.ocupacao))
			return false;
		if (padrinho == null) {
			if (other.padrinho != null)
				return false;
		} else if (!padrinho.equals(other.padrinho))
			return false;
		if (patente == null) {
			if (other.patente != null)
				return false;
		} else if (!patente.equals(other.patente))
			return false;
		if (punicoes == null) {
			if (other.punicoes != null)
				return false;
		} else if (!punicoes.equals(other.punicoes))
			return false;
		if (sede == null) {
			if (other.sede != null)
				return false;
		} else if (!sede.equals(other.sede))
			return false;
		if (statusMembro != other.statusMembro)
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		if (veiculo == null) {
			if (other.veiculo != null)
				return false;
		} else if (!veiculo.equals(other.veiculo))
			return false;
		return true;
	}
	

	
}
