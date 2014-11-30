package models;

import java.util.ArrayList;
import java.util.List;

public class OrganizadorDeMetas {
	
	private List<Semana> semanas;
	private final int NUM_SEMANAS;
	
	public OrganizadorDeMetas(){
		NUM_SEMANAS = 6;
		semanas = new ArrayList<Semana>();
		for(int i = 0; i < NUM_SEMANAS; i++){
			semanas.add(new Semana("SEMANA"+(i+1)));
		}
		
	}	

	public int getNumSemanas() {
		return NUM_SEMANAS;
	}

	public void criarMeta(String nome, String descricao, int prioridade, String semana){
		Meta novaMeta = new Meta(nome, descricao, prioridade, semana);
		switch(semana){
			case "Semana 1":				
				semanas.get(0).addMeta(novaMeta);
				break;
			case "Semana 2":
				semanas.get(1).addMeta(novaMeta);
				break;
			case "Semana 3":
				semanas.get(2).addMeta(novaMeta);
				break;
			case "Semana 4":
				semanas.get(3).addMeta(novaMeta);
				break;
			case "Semana 5":
				semanas.get(4).addMeta(novaMeta);
				break;
			case "Semana 6":
				semanas.get(5).addMeta(novaMeta);
				break;
			default:
				semanas.get(0).addMeta(novaMeta);
				break;
				
		}
			
				
	}
	
	public List<Semana> getSemanas(){
		return semanas;		
	}
	
	
}

