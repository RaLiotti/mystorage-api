package com.mystorage.api.model;

import java.time.LocalDateTime;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nomeproduto")
	private String nomeProduto;
	
	private Double valor;
	
	private String tipo;
	
	@Column(name = "datainclusao")
	private Calendar dataInclusao;
	
	@Column(name = "datafabricacao")
	private LocalDateTime dataFabricacao;
	
	@Column(name = "datavalidade")
	private LocalDateTime dataValidade;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Calendar getDataInclusao() {
		return dataInclusao;
	}
	
	public void setDataInclusao(Calendar dataInclusao) {
		this.dataInclusao = dataInclusao;
	}
	
	public LocalDateTime getDataFabricacao() {
		return dataFabricacao;
	}
	
	public void setDataFabricacao(LocalDateTime dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	public LocalDateTime getDataValidade() {
		return dataValidade;
	}
	
	public void setDataValidade(LocalDateTime dataValidade) {
		this.dataValidade = dataValidade;
	}
	
}
