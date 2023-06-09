package br.com.projetoPortFolio.Entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Projeto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataInicio;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataPrevisaoFim;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataFim;

	private String descricao;
	private String status;
	private Double orcamento;
	private String risco;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idgerente")
	private Pessoa gerenteResponsavel;

	public Projeto() {
		// TODO Auto-generated constructor stub
	}

	public Projeto(Long id, String nome, LocalDate dataInicio, LocalDate dataPrevisaoFim, LocalDate dataFim,
			String descricao, String status, Double orcamento, String risco,
			Pessoa gerenteResponsavel) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataPrevisaoFim = dataPrevisaoFim;
		this.dataFim = dataFim;
		this.descricao = descricao;
		this.status = status;
		this.orcamento = orcamento;
		this.risco = risco;
		this.gerenteResponsavel = gerenteResponsavel;
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

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataPrevisaoFim() {
		return dataPrevisaoFim;
	}

	public void setDataPrevisaoFim(LocalDate dataPrevisaoFim) {
		this.dataPrevisaoFim = dataPrevisaoFim;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Double orcamento) {
		this.orcamento = orcamento;
	}

	public String getRisco() {
		return risco;
	}

	public void setRisco(String risco) {
		this.risco = risco;
	}

	public Pessoa getGerenteResponsavel() {
		return gerenteResponsavel;
	}

	public void setGerenteResponsavel(Pessoa gerenteResponsavel) {
		this.gerenteResponsavel = gerenteResponsavel;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projeto other = (Projeto) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Projeto [id=" + id + ", nome=" + nome + ", dataInicio=" + dataInicio + ", dataPrevisaoFim="
				+ dataPrevisaoFim + ", dataFim=" + dataFim + ", descricao=" + descricao + ", status=" + status
				+ ", orcamento=" + orcamento + ", risco=" + risco + ", gerenteResponsavel=" + gerenteResponsavel + "]";
	}
	
}

	
