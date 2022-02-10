package me.dio.finallevel;

public class Contato implements Comparable<Contato>{
	
	private String nome;
	private Integer numero;
	
	
	
	public Contato(String nome, Integer numero) {
		this.nome = nome;
		this.numero = numero;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getNumero() {
		return this.numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return  "Nome: "+nome + " Numero: " + numero ;
	}
	
	@Override
	public int compareTo(Contato o) {
		return this.getNumero() - o.getNumero();
	}
	
	
}
