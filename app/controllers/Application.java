package controllers;

import models.OrganizadorDeMetas;
import play.*;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

	static OrganizadorDeMetas organizador = new OrganizadorDeMetas();
	
    public static Result index() {
        return ok(index.render(organizador.getSemanas()));
    }

    
    public static Result criarMeta(){
    	
    	DynamicForm form = Form.form().bindFromRequest();
    	
    	String nome = form.get("nome");
    	String descricao = form.get("descricao");
    	int prioridade = Integer.parseInt( form.get("prioridade"));
    	String semana = (String) form.get("semana");
    	
    	organizador.criarMeta(nome, descricao, prioridade, semana);
    	
    	return index();

    }
    
    public static Result deletarMeta(long idMeta){
    	
    	for(int i = 0; i < organizador.getNumSemanas(); i++){
    		for(int j = 0; j < organizador.getSemanas().get(i).numeroDeMetasNaSemana(); j++ ){
    			if(idMeta == organizador.getSemanas().get(i).getMetas().get(j).getId()){
    				organizador.getSemanas().get(i).getMetas().remove(j);				
    			}
    		}    		
    	}
    	
    	return index();
    	
    }
}
