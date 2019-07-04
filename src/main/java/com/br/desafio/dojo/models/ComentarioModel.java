package com.br.desafio.dojo.models;

public class ComentarioModel {
	
	private int id;
	private String foto;
	private String nome;
	private int idade;
	private String estadoCivil;
	private String comentario;
	
	public ComentarioModel() {
		
	}

	public ComentarioModel(int id, String foto, String nome, int idade, String estadoCivil, String comentario) {
		super();
		this.id = id;
		this.foto = foto;
		this.nome = nome;
		this.idade = idade;
		this.estadoCivil = estadoCivil;
		this.comentario = comentario;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		
		modelo.append("id" + this.id);
		modelo.append("Nome: " + this.nome);
		modelo.append("idade: " + this.idade);
		modelo.append("Estado Civil" + this.estadoCivil);
		modelo.append("Comentario" + this.comentario);

		return modelo.toString();
	}
	
	

	
}
