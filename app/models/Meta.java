package models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Meta implements Comparable<Meta>{

	@Id
	@GeneratedValue
	private long id;
	private String nome, descricao;
	private int prioridade;
	private String semana;
	
	
	public Meta(String nome, String descricao, int prioridade, String semana){
		this.nome = nome;
		this.descricao = descricao;
		this.prioridade =  prioridade;
		this.semana = semana;
	}

	public long getId(){
		return id;
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

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	public String getSemana() {
		return semana;
	}

	public void setSemana(String semana) {
		this.semana = semana;
	}


	@Override
	public int compareTo(Meta meta) {
		if (this.getPrioridade() < meta.getPrioridade()){
			return 1;
		}
		else if (this.getPrioridade() > meta.getPrioridade()) {
			return -1;
		}
		return 0;
	}
}