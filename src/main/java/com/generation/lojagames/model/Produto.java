package com.generation.lojagames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // Código identificador do produto. 
	
	@NotBlank (message = "O campo nome do produto não pode ficar em branco!")
	@Size (max = 30, message = "O campo só pode ser preenchido com no máximo 30 caracteres!")	
	private String nome; // Nome do jogo. 
	
	@NotNull (message = "O campo nome deve ser obrigatóriamente preenchido!")
	@Size (min = 10, max = 150, message = "O campo descrição deve conter no mínimo 10 e no máximo 150 caracteres!")	
	private String descricao; // Breve descrição sobre o jogo. 
	
	@NotBlank
	private int quantidade; // Quantidade de produto no estoque.
	
	@NotBlank
	private double preco; // preço do produto.
	
	@NotBlank
	private int parcela; // Quantidade de parcalas. 
	
	
	private String foto; // Foto do produto.
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getParcela() {
		return parcela;
	}

	public void setParcela(int parcela) {
		this.parcela = parcela;
	}
	
	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
}
