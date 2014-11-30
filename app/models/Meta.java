package models;

public class Meta implements Comparable<Meta>{

	private String nome, descricao;
	private int prioridade;
	private Semana semana;
	
	
	public Meta(String nome, String descricao, int prioridade, Semana semana){
		this.nome = nome;
		this.descricao = descricao;
		this.prioridade =  prioridade;
		this.semana = semana;
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
	
	public Semana getSemana() {
		return semana;
	}

	public void setSemana(Semana semana) {
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