package br.com.dio.poo;

import java.util.List;

public class Banco {

//	ATRIBUTOS
	private String nome;
	private List<Conta> contas;
	
//	MÉTODOS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	

}
