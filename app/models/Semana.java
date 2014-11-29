package models;

import java.util.ArrayList;
import java.util.Collections;

public class Semana {

	private String nome;
	ArrayList<Meta> metas;
	
	public Semana(String nome){
		this.nome = nome;
		metas = new ArrayList<Meta>();
		
	}
	
	public boolean isEmpty(){
		if(metas.size() > 0){
			return false;
		}	
		return true;
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Meta> getMetas() {
		return metas;
	}
	
	public void addMeta(Meta meta){
		metas.add(meta);
		Collections.sort(this.getMetas());
	}
}
