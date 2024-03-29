package com.example.curso.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id  //Primary Key
	@GeneratedValue(strategy = GenerationType.AUTO)  //AUTO_INCREMENT
	@Column(name = "id") //nome da coluna
	private Integer id;
	@Column(length = 100) //tamanho
	private String nome;

	@Column(name = "cpf", length = 11)
	private String cpf;

	@JsonIgnore
	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	private Set<Pedido> pedidos;
	
	public Cliente() {
	}
	
	public Cliente(String nome) {

		this.nome = nome;
	}

	public Cliente(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente( id=" + id + ", nome = " + nome + ") ";
	}
}

