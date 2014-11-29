package models;

public class Meta implements Comparable<Meta>{

	private String nome, descricao;
	private int prioridade;
	
	public Meta(String nome, String descricao, int prioridade){
		this.nome = nome;
		this.descricao = descricao;
		this.prioridade =  prioridade;		
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