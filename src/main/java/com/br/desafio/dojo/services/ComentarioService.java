package com.br.desafio.dojo.services;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

import com.br.desafio.dojo.models.ComentarioModel;

@Service
public class ComentarioService {

	@SuppressWarnings("serial")
	private Map<Integer, ComentarioModel> listaComentarios=new HashMap<Integer,ComentarioModel>(){{put(1,new ComentarioModel(1,"link da imagem","gessica",18,"solteira","comentario"));

	}};

	public Collection<ComentarioModel> mostrarComentario() {
		return this.listaComentarios.values();
	}

	public void addComentario(ComentarioModel comentarioModel) {
		listaComentarios.put(listaComentarios.size() + 1, comentarioModel);
	}

	public void apagarComentario(ComentarioModel comentario) {
		ComentarioModel retorno = null;
	  for(Entry<Integer, ComentarioModel> entry : listaComentarios.entrySet()) {
		  if(entry.getValue().getId() == comentario.getId())
		  retorno = entry.getValue();
	  }
	  
	  	if(comentario != null) {
	  		listaComentarios.remove(retorno);
	  	}
	 

	 }}
